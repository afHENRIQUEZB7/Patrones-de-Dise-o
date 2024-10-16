package com.FactoryMethod.normalFactory.models;

import com.FactoryMethod.normalFactory.Vehicle;

public class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("--> Run Motorcycle !!");
    }

    @Override
    public void stop() {
        System.out.println("--> Stop Motorcycle !!");
    }
}
