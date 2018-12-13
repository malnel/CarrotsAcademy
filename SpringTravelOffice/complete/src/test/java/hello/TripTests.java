package hello;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TripTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private TripRepository tripRepository;

    @Before
    public void deleteAllBeforeTests() throws Exception {
        tripRepository.deleteAll();
    }

    @Test
    public void shouldReturnTripRepositoryIndex() throws Exception {
        mockMvc.perform(get("/")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$._links.trips").exists());
    }

    @Test
    public void shouldCreateTripEntity() throws Exception {

        mockMvc.perform(post("/trips").content(
                "{\"destination\": \"Majorca\", \"startDate\":\"12-12-2018\", \"endDate\": \"22-12-2018\", \"price\": \"2500\"}"))
                .andExpect(status().isCreated())
                .andExpect(header().string("Location", containsString("trips/")));
    }

    @Test
    public void shouldRetrieveTripEntity() throws Exception {

        MvcResult mvcResult = mockMvc.perform(post("/trips").content(
                "{\"destination\": \"Majorca\", \"startDate\":\"12-12-2018\", \"endDate\": \"22-12-2018\", \"price\": \"2500\"}"))
                .andExpect(status().isCreated()).andReturn();

        String location = mvcResult.getResponse().getHeader("Location");
        mockMvc.perform(get(location))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.destination").value("Majorca"))
                .andExpect(jsonPath("$.startDate").value("12-12-2018"))
                .andExpect(jsonPath("$.endDate").value("22-12-2018"))
                .andExpect(jsonPath("$.price").value("2500"));
    }

    @Test
    public void shouldQueryTripEntity() throws Exception {

        mockMvc.perform(post("/trips").content(
                "{\"destination\": \"Majorca\", \"startDate\":\"12-12-2018\", \"endDate\": \"22-12-2018\", \"price\": \"2500\"}"))
                .andExpect(status().isCreated());

        mockMvc.perform(
                get("/trips/search/findByDestination?destination={destination}", "Majorca"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$._embedded.trips[0].destination").value(
                        "Majorca"));
    }

    @Test
    public void shouldUpdateTripEntity() throws Exception {

        MvcResult mvcResult = mockMvc.perform(post("/trips").content(
                "{\"destination\": \"Majorca\", \"startDate\":\"12-12-2018\", \"endDate\": \"22-12-2018\", \"price\": \"2500\"}"))
                .andExpect(status().isCreated()).andReturn();

        String location = mvcResult.getResponse().getHeader("Location");

        mockMvc.perform(put(location).content(
                "{\"destination\": \"Majorca\", \"startDate\":\"10-10-2018\", \"endDate\": \"22-12-2018\", \"price\": \"1900\"}"))
                .andExpect(status().isNoContent());

        mockMvc.perform(get(location))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.destination").value("Majorca"))
                .andExpect(jsonPath("$.startDate").value("10-10-2018"))
                .andExpect(jsonPath("$.endDate").value("22-12-2018"))
                .andExpect(jsonPath("$.price").value("1900"));
    }

    @Test
    public void shouldPartiallyUpdateTripEntity() throws Exception {

        MvcResult mvcResult = mockMvc.perform(post("/trips").content(
                "{\"destination\": \"Majorca\", \"startDate\":\"12-12-2018\", \"endDate\": \"22-12-2018\", \"price\": \"1900\"}"))
                .andExpect(status().isCreated()).andReturn();

        String location = mvcResult.getResponse().getHeader("Location");

        mockMvc.perform(
                patch(location).content("{\"destination\": \"Ibiza\"}"))
                .andExpect(status().isNoContent());

        mockMvc.perform(get(location))
                .andExpect(status().isOk())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.destination").value("Ibiza"))
                .andExpect(jsonPath("$.startDate").value("12-12-2018"))
                .andExpect(jsonPath("$.endDate").value("22-12-2018"))
                .andExpect(jsonPath("$.price").value("1900"));
    }

    @Test
    public void shouldDeleteTripEntity() throws Exception {

        MvcResult mvcResult = mockMvc.perform(post("/customers").content(
                "{\"destination\": \"Majorca\", \"startDate\":\"12-12-2018\", \"endDate\": \"22-12-2018\", \"price\": \"1900\"}"))
                .andExpect(status().isCreated()).andReturn();

        String location = mvcResult.getResponse().getHeader("Location");
        mockMvc.perform(delete(location)).andExpect(status().isNoContent());

        mockMvc.perform(get(location)).andExpect(status().isNotFound());
    }

}