package com.lisichka;

public class ClassicalMusic implements Music {

    public void myInit() {
        System.out.println("Doing my classic initialisation");
    }

    public void myDestroy() {
        System.out.println("Doing my classic destruction");
    }

    @Override
    public String getSong() {
        return "Mozart";
    }


}
