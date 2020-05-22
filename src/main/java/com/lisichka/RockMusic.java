package com.lisichka;

public class RockMusic implements Music {

    public void myInit() {
        System.out.println("Doing my rock initialisation");
    }

    public void myDestroy() {
        System.out.println("Doing my rock destruction");
    }
    @Override
    public String getSong() {
        return "Aria";
    }
}
