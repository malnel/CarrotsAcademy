package workshop.sb.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(properties = {"foo=Foo property",
                                    "bar=Bar property",
                                    "x=10"})
public class MainControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    protected Environment env;

    @Test
    public void foo() throws Exception {
        mockMvc.perform(get("/foo"))
                .andExpect(status().isOk())
                .andExpect(content().string(env.getProperty("foo")));
    }

    @Test
    public void bar() throws Exception {
        mockMvc.perform(get("/bar"))
                .andExpect(status().isOk())
                .andExpect(content().string(env.getProperty("bar")));
    }

    @Test
    public void x() throws Exception {
        mockMvc.perform(get("/x"))
                .andExpect(status().isOk())
                .andExpect(content().string(env.getProperty("x")));
    }
}
