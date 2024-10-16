package org.example.factory;

import org.example.Vehicle;
import org.example.models.Plane;

public class PlaneFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Plane();
    }
}
