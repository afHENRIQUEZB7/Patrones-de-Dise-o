package com.AbtractFactory.Products.trousers;

import com.AbtractFactory.Products.ITrousers;

public class GalaTrousers implements ITrousers {
    @Override
    public boolean hasPockets() {
        System.out.println("Pantalones de gala -- Tienen bolsillos? --> Si");
        return true;
    }

    @Override
    public String getClosuretype() {
        System.out.println("Pantalones de gala -- Tienen cierre? --> cierre - cremayera");
        return "cierre - cremayera";
    }
}
