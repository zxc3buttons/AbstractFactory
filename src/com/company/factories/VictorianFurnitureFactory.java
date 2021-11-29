package com.company.factories;

import com.company.products.*;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianTable();
    }

    @Override
    public void getName() {
        System.out.println("VictorianFurnitureFactory");
    }
}
