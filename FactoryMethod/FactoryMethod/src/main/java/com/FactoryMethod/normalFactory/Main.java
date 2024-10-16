package com.FactoryMethod.normalFactory;

import com.FactoryMethod.normalFactory.factory.VehicleFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle car = vehicleFactory.createVehicle(TypeOfVehicle.CAR.name());
        Vehicle truck = vehicleFactory.createVehicle(TypeOfVehicle.TRUCK.name());
        Vehicle motorcycle = vehicleFactory.createVehicle(TypeOfVehicle.MOTORCYCLE.name());
        Vehicle plane = vehicleFactory.createVehicle(TypeOfVehicle.PLANE.name());

        car.start();
        truck.start();
        motorcycle.start();
        plane.start();

    }
}