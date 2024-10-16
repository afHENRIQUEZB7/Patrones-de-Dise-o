package org.example;

import org.example.factory.CarFactory;
import org.example.factory.MotorcycleFactory;
import org.example.factory.PlaneFactory;
import org.example.factory.TruckFactory;


public class Main {
    public static void main(String[] args) {
        Vehicle car = new CarFactory().createVehicle();
        Vehicle truck = new TruckFactory().createVehicle();
        Vehicle plane = new PlaneFactory().createVehicle();
        Vehicle motorcycle = new MotorcycleFactory().createVehicle();

        car.star();
        truck.star();
        plane.star();
        motorcycle.star();
    }
}