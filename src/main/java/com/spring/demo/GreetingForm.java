package com.spring.demo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class GreetingForm {

    @NotNull
    @Size(min=2, max=30)
    private String name;

    // getter setters
    public String getName() { return this.name; }
    public void setName(String name) {
        System.out.println("set GreetingForm.name: " + name);
        this.name = name;
    }
    public String toString() {
        return "Hello again " + this.name;
    }
    
}
