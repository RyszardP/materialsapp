package com.ryszard.springboot.demo.materialsapp.rest;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class MainRestController {

    @GetMapping("/")
    public String myAppGreeting(
            @RequestParam(name="name", required=false, defaultValue="World") String name,
            Map<String, Object> model
    )
    {
        model.put("name", name);
        return "greeting";
    }
    @GetMapping
    public String main(Map<String, Object> model) {
        model.put("some", "hello!");
        return "main";
    }



}
