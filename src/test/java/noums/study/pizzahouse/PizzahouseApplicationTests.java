package noums.study.pizzahouse;

import com.fasterxml.jackson.databind.ObjectMapper;
import noums.study.pizzahouse.controller.OrderController;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import javax.print.attribute.standard.Media;
import java.awt.*;
import java.nio.charset.Charset;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest //(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class PizzahouseApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    // BULGOGI_PIZZA
    // FRIED_CHICKEN
    @Test
    public void postUrlTest() throws Exception {
        this.mockMvc.perform(post("/orders").contentType(contentType)
                .content("{\"menu\" : \"FRIED_CHICKEN\", \"pay\" : \"CARD\"}")).andExpect(status().isOk()).andDo(print());
    }

    @Test
    void failToOrder() throws Exception {
        //Given
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("menu", "FRIED_CHICKEN");
       // jsonObject.put("payMethod", "CARD");

        //When
        mockMvc.perform(MockMvcRequestBuilders.post("/orders")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonObject.toString())
                .characterEncoding("UTF-8")
                .accept(MediaType.APPLICATION_JSON)
        )

                //Then
                .andDo(print())
                .andExpect(status().isOk());
    }


}
