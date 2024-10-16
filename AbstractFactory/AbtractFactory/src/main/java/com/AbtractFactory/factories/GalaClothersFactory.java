package com.AbtractFactory.factories;

import com.AbtractFactory.ClothesFactory;
import com.AbtractFactory.Products.IShirt;
import com.AbtractFactory.Products.IShoe;
import com.AbtractFactory.Products.ITrousers;
import com.AbtractFactory.Products.shirt.GalaShirt;
import com.AbtractFactory.Products.shoe.GalaShoe;
import com.AbtractFactory.Products.trousers.GalaTrousers;

public class GalaClothersFactory implements ClothesFactory {
    @Override
    public IShoe createShoes() {
        return new GalaShoe();
    }

    @Override
    public IShirt createShirt() {
        return new GalaShirt();
    }

    @Override
    public ITrousers createTrousers() {
        return new GalaTrousers();
    }
}
