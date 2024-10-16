package com.AbtractFactory;

import com.AbtractFactory.Products.shirt.GalaShirt;
import com.AbtractFactory.Products.shirt.SportShirt;
import com.AbtractFactory.Products.shoe.GalaShoe;
import com.AbtractFactory.Products.shoe.SportShoe;
import com.AbtractFactory.Products.trousers.GalaTrousers;
import com.AbtractFactory.Products.trousers.SportTrousers;
import com.AbtractFactory.factories.GalaClothersFactory;
import com.AbtractFactory.factories.SportClothersFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Fabrica de ropa deportiva
        ClothesFactory sportClothesFactory = new SportClothersFactory();

        SportShirt sportShirt = (SportShirt) sportClothesFactory.createShirt();
        SportShoe sportShoe = (SportShoe) sportClothesFactory.createShoes();
        SportTrousers sportTrousers = (SportTrousers) sportClothesFactory.createTrousers();

        System.out.println("\n ----> Ejemplo de ropa deportiva <-------");
        sportShirt.hasButtons();
        sportShirt.hasLongSleeves();
        sportShoe.isEleganteShoes();
        sportShoe.isRunningShoes();
        sportTrousers.getClosuretype();
        sportTrousers.hasPockets();

        // Fabrica de ropa de gala

        ClothesFactory galaClothesFactory = new GalaClothersFactory();

        GalaShirt galaShirt = (GalaShirt) galaClothesFactory.createShirt();
        GalaShoe galaShoe = (GalaShoe) galaClothesFactory.createShoes();
        GalaTrousers galaTrousers = (GalaTrousers) galaClothesFactory.createTrousers();

        System.out.println("\n ----> Ejemplo ropa de gala <-------");
        galaShirt.hasButtons();
        galaShirt.hasLongSleeves();
        galaShoe.isEleganteShoes();
        galaShoe.isRunningShoes();
        galaTrousers.getClosuretype();
        galaTrousers.hasPockets();


    }
}