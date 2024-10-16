package com.FactoryMethod.normalFactory.factory;

import com.FactoryMethod.normalFactory.Vehicle;
import com.FactoryMethod.normalFactory.models.Car;
import com.FactoryMethod.normalFactory.models.Motorcycle;
import com.FactoryMethod.normalFactory.models.Plane;
import com.FactoryMethod.normalFactory.models.Truck;

public class VehicleFactory {
    public Vehicle createVehicle(String typeOfVehicle){
        if (typeOfVehicle.equalsIgnoreCase("Car")){
            return new Car();
        }
        if (typeOfVehicle.equalsIgnoreCase("Motorcycle")) {
            return new Motorcycle();
        }
        if (typeOfVehicle.equalsIgnoreCase("Truck")){
            return new Truck();
        }
        if (typeOfVehicle.equalsIgnoreCase("Plane")){
            return new Plane();
        }
        return null;
    }
}
