package com.example.task_01.models;

import org.springframework.web.bind.annotation.RequestParam;

public class Greeting {

    private String name;
    private String timeOfDay;

    public Greeting(String name, @RequestParam(value = "timeOfDay") String timeOfDay){
        this.name = name;
        this.timeOfDay = timeOfDay;
    }

    // Getters and Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public String getName() {
        return name;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }
}
