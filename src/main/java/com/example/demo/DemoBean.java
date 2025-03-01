package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class DemoBean {

    private String message = "This is a Demo Bean!";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
