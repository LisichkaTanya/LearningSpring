package ru.useAnnotation.HomeWork2_useJavaCod;

import java.util.ArrayList;
import java.util.List;

public class RockMusic1 implements Music1 {
    private List<String> rockList = new ArrayList<>();

    //Блок инициализации объекта (англ. Instance initialization block)
    //Выполняется каждый раз, когда создается объект класса
    {
        rockList.add("Rock music one");
        rockList.add("Rock music two");
        rockList.add("Rock music three");
    }
    @Override
    public List<String> getSong() {
        return rockList;
    }
}
