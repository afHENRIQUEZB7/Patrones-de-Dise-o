package com.AbtractFactory;

import com.AbtractFactory.Products.IShirt;
import com.AbtractFactory.Products.IShoe;
import com.AbtractFactory.Products.ITrousers;

public interface ClothesFactory {

    IShoe createShoes();
    IShirt createShirt();
    ITrousers createTrousers();


}
