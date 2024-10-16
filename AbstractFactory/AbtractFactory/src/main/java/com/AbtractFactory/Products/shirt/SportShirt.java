package com.AbtractFactory.Products.shirt;

import com.AbtractFactory.Products.IShirt;

public class SportShirt implements IShirt {
    @Override
    public boolean hasLongSleeves() {
        System.out.println("Camisa deportiva -- Tiene mangas largas? --> No");
        return false;
    }

    @Override
    public boolean hasButtons() {
        System.out.println("Camisa deportiva -- Tiene botones? --> No");
        return false;
    }
}
