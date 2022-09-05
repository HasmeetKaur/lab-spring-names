package com.example.task_01.controllers;

import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class Controller {

    @GetMapping
    public Greeting newGreeting(){
        return new Greeting("Alex", newGreeting().getTimeOfDay());
    }
}
