package com.Prototype.prototype;

import java.util.ArrayList;
import java.util.List;

public class Producto implements IPrototype{

    private String name;
    private double price;

    public Producto(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public IPrototype clone() {
        Producto clone = new Producto(this.name, this.price);
        return clone;
    }

    @Override
    public IPrototype deepClone() {
        return clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return Integer.toHexString(System.identityHashCode(this))+ " - Producto{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
