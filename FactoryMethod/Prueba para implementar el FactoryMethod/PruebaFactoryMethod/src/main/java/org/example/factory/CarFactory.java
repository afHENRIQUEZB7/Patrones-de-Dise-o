package org.example.factory;

import org.example.Vehicle;
import org.example.models.Car;

public class CarFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
