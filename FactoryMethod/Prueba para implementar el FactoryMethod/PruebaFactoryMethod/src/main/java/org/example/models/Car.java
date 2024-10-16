package org.example.models;

import org.example.Vehicle;

public class Car implements Vehicle {
    @Override
    public void star() {
        System.out.println("---> Run Car !!");
    }

    @Override
    public void stop() {
        System.out.println("---> Stop Car !!");
    }
}
