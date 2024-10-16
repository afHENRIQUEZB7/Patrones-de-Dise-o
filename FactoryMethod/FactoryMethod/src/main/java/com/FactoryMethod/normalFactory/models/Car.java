package com.FactoryMethod.normalFactory.models;

import com.FactoryMethod.normalFactory.Vehicle;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("--> Run car !!");
    }

    @Override
    public void stop() {
        System.out.println("--> Stop car !!");
    }
}