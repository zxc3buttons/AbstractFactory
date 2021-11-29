package com.company;

import com.company.factories.ModernFurnitureFactory;
import com.company.factories.VictorianFurnitureFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        FurnitureApplication furnitureApplication;

        Scanner scanner = new Scanner(System.in);
        String config = scanner.nextLine();

        if(config.equals("Modern")) {
            furnitureApplication = new FurnitureApplication(new ModernFurnitureFactory());
        }
        else if(config.equals("Victorian")) {
            furnitureApplication = new FurnitureApplication(new VictorianFurnitureFactory());
        }
        else {
            throw new Exception("Unknown furniture type");
        }

        furnitureApplication.createFurniture();

        furnitureApplication.checkLegsOfChair();
        furnitureApplication.checkShapeOfCoffeeTable();
        furnitureApplication.checkSoftOfSofa();

    }
}
