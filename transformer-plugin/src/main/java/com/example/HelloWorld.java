package com.example;

/**
 * Created by Navkrishna on July 05, 2016
 */

public class HelloWorld {

    private final String greetMessage;

    public HelloWorld(String greetMessage) {
        this.greetMessage = greetMessage;
    }

    public String greet() {
        return greetMessage;
    }
}
