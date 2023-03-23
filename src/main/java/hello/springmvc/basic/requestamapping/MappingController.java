package hello.springmvc.basic.requestamapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MappingController {
    private Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/hello-basic")
    public String helloBasic(){
        log.info("Hello-basic");
        return "ok";
    }


    /*
    * PathVariable 사용
    * 변수 명이 같으면 생략 가능
    *
    * @PathVariable("userId") String data)  -> @PathVariable String userId)
    * */
    @GetMapping("/mapping/{userId}")
    public String mappingPath(@PathVariable("userId") String data){
        log.info("mappingPath userId={}", data);

        return "ok";

    }

}
