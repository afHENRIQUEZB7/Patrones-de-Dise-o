package org.example.models;

import org.example.Vehicle;

public class Plane implements Vehicle {
    @Override
    public void star() {
        System.out.println("---> Run Plane !!");
    }

    @Override
    public void stop() {
        System.out.println("---> Stop Plane");
    }

    public void fly(){
        System.out.println("---> Avion despegando !!");
    }
}
