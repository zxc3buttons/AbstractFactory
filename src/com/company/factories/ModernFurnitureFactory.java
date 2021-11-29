package com.company.factories;

import com.company.products.*;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernTable();
    }

    @Override
    public void getName() {
        System.out.println("ModernFurnitureFactory");
    }
}
