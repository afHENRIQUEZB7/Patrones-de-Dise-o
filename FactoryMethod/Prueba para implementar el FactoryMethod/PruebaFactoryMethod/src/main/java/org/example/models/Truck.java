package org.example.models;

import org.example.Vehicle;

public class Truck implements Vehicle {
    @Override
    public void star() {
        System.out.println("---> Run Truck");
    }

    @Override
    public void stop() {
        System.out.println("---> Stop Truck");
    }
}
