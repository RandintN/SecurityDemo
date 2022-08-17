package simple.software.learn.clidemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

//@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = HelloController.class)
class HelloControllerIT {
  @Autowired
  private MockMvc mvc;

  @Test
  @WithMockUser(username = "rob", password = "{bcrypt}$2a$10$hdPIF/DjjhaxyA78q5BKWul0SoRNZFa4cWM4PMEiqcce0gwWa.YHy")
  void hello() throws Exception {
    final MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/");

    final MvcResult result = mvc.perform(request).andReturn();

    Assertions.assertEquals("Tudo que o Robson toca vira ouro!", result.getResponse().getContentAsString());
  }
}