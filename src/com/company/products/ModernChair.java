package com.company.products;

public class ModernChair implements Chair{

    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void sitOn() {
        System.out.println("стул в стиле Модерн");
    }
}
