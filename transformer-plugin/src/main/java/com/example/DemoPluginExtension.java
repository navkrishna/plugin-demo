package com.example;

/**
 * Created by Navkrishna on July 05, 2016
 */

public class DemoPluginExtension {
    private String message = "Default Greeting from Gradle";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
