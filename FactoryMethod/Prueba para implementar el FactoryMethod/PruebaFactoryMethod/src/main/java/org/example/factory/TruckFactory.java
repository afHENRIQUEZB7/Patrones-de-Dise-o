package org.example.factory;

import org.example.Vehicle;
import org.example.models.Truck;

public class TruckFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}
