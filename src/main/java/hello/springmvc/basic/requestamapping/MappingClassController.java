package hello.springmvc.basic.requestamapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    @GetMapping
    public String user(){
        return "get users";
    }
    @PostMapping
    public String addUser(){
        return "post user";
    }
    @GetMapping("/{userId}")
    public String findUser(@PathVariable("userId") String userId){

        return "get userId =" +userId;
    }

    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable("userId") String userId){
        return "updateUser userId =" +userId;
    }



    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable("userId") String userId){
        return "delete userId =" +userId;
    }

}
