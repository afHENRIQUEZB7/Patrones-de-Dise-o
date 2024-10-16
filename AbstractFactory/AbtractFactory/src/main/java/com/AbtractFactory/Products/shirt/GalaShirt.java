package com.AbtractFactory.Products.shirt;

import com.AbtractFactory.Products.IShirt;

public class GalaShirt implements IShirt {
    @Override
    public boolean hasLongSleeves() {
        System.out.println("Camisa de gala -- Tiene mangas largas? --> Si");
        return true;
    }

    @Override
    public boolean hasButtons() {
        System.out.println("Camisa de gala -- Tiene botones? --> Si");
        return true;
    }
}
