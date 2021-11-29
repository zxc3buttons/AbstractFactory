package com.company.factories;

import com.company.products.Chair;
import com.company.products.CoffeeTable;
import com.company.products.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
    void getName();
}
