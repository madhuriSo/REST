package com.sd.controller;

import com.sd.model.RegisterModel;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @CrossOrigin(origins = "http://localhost:4300/")
    @PostMapping("/test")
    public String test(@RequestParam("register") RegisterModel register){
        System.out.print(register);
        return "Spring Boot --!!";
    }
}
