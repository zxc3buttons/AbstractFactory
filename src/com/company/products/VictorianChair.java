package com.company.products;

public class VictorianChair implements Chair{

    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitOn() {
        System.out.println("Викторианский стул");
    }
}
