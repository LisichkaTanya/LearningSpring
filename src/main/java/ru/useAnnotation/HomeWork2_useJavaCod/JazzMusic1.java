package ru.useAnnotation.HomeWork2_useJavaCod;

import java.util.ArrayList;
import java.util.List;


public class JazzMusic1 implements Music1 {
    private List<String> jazzList = new ArrayList<>();

    //Блок инициализации объекта (англ. Instance initialization block)
    //Выполняется каждый раз, когда создается объект класса
    {
        jazzList.add("Jazz music one");
        jazzList.add("Jazz music two");
        jazzList.add("Jazz music three");
    }

    @Override
    public List<String> getSong() {
        return jazzList;
    }
}
