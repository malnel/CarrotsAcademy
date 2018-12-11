package workshop.sb.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static junit.framework.TestCase.fail;

@RunWith(SpringRunner.class)
@WebMvcTest
public class HelloControllerTests {


    @Autowired
    private MockMvc mockMvc;


    @Test
    public void shouldReturnHelloFromProperties() throws Exception {
        // TODO 6 zaktualizuj test
        fail();
    }

    @Test
    public void shouldReturnMsgFromProperties() throws Exception {
        // TODO 8 zaktualizuj test
        fail();
    }

    @Test
    public void shouldReturnFooFromYAML() throws Exception {
        // TODO 10 zaktualizuj test
        fail();
    }

}

