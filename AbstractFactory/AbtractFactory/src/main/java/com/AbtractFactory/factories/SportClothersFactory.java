package com.AbtractFactory.factories;

import com.AbtractFactory.ClothesFactory;
import com.AbtractFactory.Products.IShirt;
import com.AbtractFactory.Products.IShoe;
import com.AbtractFactory.Products.ITrousers;
import com.AbtractFactory.Products.shirt.SportShirt;
import com.AbtractFactory.Products.shoe.SportShoe;
import com.AbtractFactory.Products.trousers.SportTrousers;

public class SportClothersFactory implements ClothesFactory {
    @Override
    public IShoe createShoes() {
        return new SportShoe();
    }

    @Override
    public IShirt createShirt() {
        return new SportShirt();
    }

    @Override
    public ITrousers createTrousers() {
        return new SportTrousers();
    }
}
