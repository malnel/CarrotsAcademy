/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
public class CustomerTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private CustomerRepository customerRepository;

	@Before
	public void deleteAllBeforeTests() throws Exception {
		customerRepository.deleteAll();
	}

	@Test
	public void shouldReturnCustomerRepositoryIndex() throws Exception {

		mockMvc.perform(get("/")).andDo(print())
				.andExpect(status().isOk())
				.andExpect(jsonPath("$._links.customers").exists());
	}

	@Test
	public void shouldCreateCustomerEntity() throws Exception {

		mockMvc.perform(post("/customers").content(
				"{\"name\": \"Anna Kot\", \"address\":\"Kilinskiego 20, Wroclaw\"}"))
				.andExpect(status().isCreated())
				.andExpect(header().string("Location", containsString("customers/")));
	}

	@Test
	public void shouldRetrieveCustomerEntity() throws Exception {

		MvcResult mvcResult = mockMvc.perform(post("/customers").content(
				"{\"name\": \"Anna Kot\", \"address\":\"Kilinskiego 20, Wroclaw\"}"))
				.andExpect(status().isCreated()).andReturn();

		String location = mvcResult.getResponse().getHeader("Location");
		mockMvc.perform(get(location))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.name").value("Anna Kot"))
				.andExpect(jsonPath("$.address").value("Kilinskiego 20, Wroclaw"));
	}

	@Test
	public void shouldQueryCustomerEntity() throws Exception {

		mockMvc.perform(post("/customers").content(
				"{ \"name\": \"Anna Kot\", \"address\":\"Kilinskiego 20, Wroclaw\"}"))
				.andExpect(status().isCreated());

		mockMvc.perform(
				get("/customers/search/findByName?name={name}", "Anna Kot"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$._embedded.customers[0].name").value(
										"Anna Kot"));
	}

	@Test
	public void shouldUpdateCustomerEntity() throws Exception {

		MvcResult mvcResult = mockMvc.perform(post("/customers").content(
				"{\"name\": \"Anna Kot\", \"address\":\"Kilinskiego 20, Wroclaw\"}"))
				.andExpect(status().isCreated()).andReturn();

		String location = mvcResult.getResponse().getHeader("Location");

		mockMvc.perform(put(location).content(
				"{\"name\": \"Kamil Lis\", \"address\":\"Kilinskiego 20, Wroclaw\"}"))
				.andExpect(status().isNoContent());

		mockMvc.perform(get(location))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.name").value("Kamil Lis"))
				.andExpect(jsonPath("$.address").value("Kilinskiego 20, Wroclaw"));
	}

	@Test
	public void shouldPartiallyUpdateCustomerEntity() throws Exception {

		MvcResult mvcResult = mockMvc.perform(post("/customers").content(
				"{\"name\": \"Anna Kot\", \"address\":\"Kilinskiego 20, Wroclaw\"}"))
				.andExpect(status().isCreated()).andReturn();

		String location = mvcResult.getResponse().getHeader("Location");

		mockMvc.perform(
				patch(location).content("{\"name\": \"Anna Kot-Lis\"}"))
				.andExpect(status().isNoContent());

		mockMvc.perform(get(location))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.name").value("Anna Kot-Lis"))
				.andExpect(jsonPath("$.address").value("Kilinskiego 20, Wroclaw"));
	}

	@Test
	public void shouldDeleteCustomerEntity() throws Exception {

		MvcResult mvcResult = mockMvc.perform(post("/customers").content(
				"{ \"name\": \"Anna Kot\", \"address\":\"Kilinskiego 20, Wroclaw\"}"))
				.andExpect(status().isCreated()).andReturn();

		String location = mvcResult.getResponse().getHeader("Location");
		mockMvc.perform(delete(location)).andExpect(status().isNoContent());

		mockMvc.perform(get(location)).andExpect(status().isNotFound());
	}
}