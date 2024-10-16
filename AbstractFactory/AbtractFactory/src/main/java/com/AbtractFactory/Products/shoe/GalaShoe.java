package com.AbtractFactory.Products.shoe;

import com.AbtractFactory.Products.IShoe;

public class GalaShoe implements IShoe {
    @Override
    public boolean isEleganteShoes() {
        System.out.println("Zapatos de gala -- Son zapatos elegantes? --> Si");
        return true;
    }

    @Override
    public boolean isRunningShoes() {
        System.out.println("Zapatos de gala -- Son zapatos para correr? --> No");
        return false;
    }
}
