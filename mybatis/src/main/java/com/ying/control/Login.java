package com.ying.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {

    @GetMapping("/")
    public  String Login(){
      return "hello";
    }
}
