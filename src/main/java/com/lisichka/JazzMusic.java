package com.lisichka;

public class JazzMusic implements Music {

    public void myInit() {
        System.out.println("Doing my jazz initialisation");
    }

    public void myDestroy() {
        System.out.println("Doing my jazz destruction");
    }
    @Override
    public String getSong() {
        return "Franc Sinatra";
    }

}
