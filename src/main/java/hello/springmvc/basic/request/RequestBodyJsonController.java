package hello.springmvc.basic.request;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import hello.springmvc.basic.HelloData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class RequestBodyJsonController {
    private ObjectMapper objectMapper = new ObjectMapper();

    @ResponseBody
    @PostMapping("/request-body-json-v2")
    public String requestBodyJsonV2 (@RequestBody String messageBody) throws JsonProcessingException {
        log.info("messageBody={}",messageBody);
        HelloData helloData = objectMapper.readValue(messageBody,HelloData.class);
        log.info("username={},age={}",helloData.getUsername(),helloData.getAge());
        return "ok";

    }



    @ResponseBody
    @PostMapping("/request-body-json-v3")
    public HelloData requestBodyJsonV3 (@RequestBody HelloData messageBody) throws JsonProcessingException {

        log.info("username={},age={}",messageBody.getUsername(),messageBody.getAge());
        return messageBody;
    }



}
