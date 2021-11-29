package com.company;

import com.company.factories.FurnitureFactory;
import com.company.products.Chair;
import com.company.products.CoffeeTable;
import com.company.products.Sofa;

public class FurnitureApplication {

    private Chair chair;
    private CoffeeTable coffeeTable;
    private Sofa sofa;

    private FurnitureFactory furnitureFactory;

    public FurnitureApplication(FurnitureFactory furnitureFactory) {
        this.furnitureFactory = furnitureFactory;
    }

    public void createFurniture() {
        furnitureFactory.getName();
        this.chair = furnitureFactory.createChair();
        this.coffeeTable = furnitureFactory.createCoffeeTable();
        this.sofa = furnitureFactory.createSofa();
    }

    public void checkLegsOfChair() {
        if(chair.hasLegs()) System.out.println("У стула есть ножки");
        else System.out.println("У стула нет ножек");
    }

    public void checkSoftOfSofa() {
        if(sofa.hasSoft()) System.out.println("Диван мягкий");
        else System.out.println("Диван не мягкий");
    }

    public void checkShapeOfCoffeeTable() {
        if(coffeeTable.specificShape().equals("Circle")) System.out.println("Стол круглый");
        else System.out.println("Прямоугольный");
    }

}
