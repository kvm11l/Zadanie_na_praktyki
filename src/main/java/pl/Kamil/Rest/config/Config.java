package pl.Kamil.Rest.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration                                                                      // adontacja przez ktora umozliwia znalezienie


public class Config {

    @Autowired
    private ObjectMapper objectMapper;

    void customizeObjectMapper(){
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);           // serializacja tylko pol ktore nie sa nullem
    }


}
