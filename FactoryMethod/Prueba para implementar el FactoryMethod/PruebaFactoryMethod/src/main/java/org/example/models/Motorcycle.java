package org.example.models;

import org.example.Vehicle;

public class Motorcycle implements Vehicle {
    @Override
    public void star() {
        System.out.println("---> Run Motorcycle");
    }

    @Override
    public void stop() {
        System.out.println("---> Stop Motorcycle");
    }
}
