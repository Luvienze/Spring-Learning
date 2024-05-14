package com.luvienze.springcoredemo.rest;

import com.luvienze.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // define private field for depeendency

    private Coach myCoach;

    // define constructor for dependency injection

    /* @Autowired
    public DemoController(Coach theCoach){
        myCoach = theCoach;
    }*/

    // Originally it was set method but because of it is autowired, spring understand the injection
    @Autowired
    public void doSomeStuff(Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }



}


