package org.example.factory;

import org.example.Vehicle;
import org.example.models.Motorcycle;

public class MotorcycleFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}
