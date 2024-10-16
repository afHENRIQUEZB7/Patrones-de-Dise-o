package com.AbtractFactory.Products.trousers;

import com.AbtractFactory.Products.ITrousers;

public class SportTrousers implements ITrousers {
    @Override
    public boolean hasPockets() {
        System.out.println("Pantalones deprotivos -- Tienen bolsillos? -- No");
        return false;
    }

    @Override
    public String getClosuretype() {
        System.out.println("Pantalones deprotivos -- Tienen de cierre? -- Sin cierre");
        return "Sin cierre";
    }
}
