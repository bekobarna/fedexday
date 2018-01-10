package com.greenfox.fedex.bigfatmoviequiz.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld(){
        return "wazzup motherfucker? U ready to QUIZ???";
    }
}
