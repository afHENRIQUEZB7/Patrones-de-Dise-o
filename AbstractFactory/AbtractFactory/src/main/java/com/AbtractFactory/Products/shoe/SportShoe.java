package com.AbtractFactory.Products.shoe;

import com.AbtractFactory.Products.IShoe;

public class SportShoe implements IShoe {
    @Override
    public boolean isEleganteShoes() {
        System.out.println("Zapatos deprotivos -- Son zapatos elegantes? --> No");
        return false;
    }

    @Override
    public boolean isRunningShoes() {
        System.out.println("Zapatos deprotivos -- Son zapatos para correr? --> Si");
        return true;
    }
}
