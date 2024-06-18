package com.luvienze.springcoredemo.rest;

import com.luvienze.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // define private field for depeendencyd

    private Coach myCoach;

    private Coach anotherCoach;

    // define constructor for dependency injection

    //default scope is singleton
    @Autowired
    public DemoController
            (@Qualifier("cricketCoach") Coach theCoach,
             @Qualifier("anotherCoach") Coach theAnotherCoach){
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    //checks to see if this is the same bean, singleton is true, prototype is false
    @GetMapping("/check")
    public String check(){
        return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }

}


