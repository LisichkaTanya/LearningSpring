package ru.useAnatation.HomeWork2;

import java.util.ArrayList;
import java.util.List;


public class ClassicalMusic implements Music {
    private List<String> classicalList = new ArrayList<>();

    //Блок инициализации объекта (англ. Instance initialization block)
    //Выполняется каждый раз, когда создается объект класса
    {
        classicalList.add("Classical music one");
        classicalList.add("Classical music two");
        classicalList.add("Classical music three");
    }

    @Override
    public List<String> getSong() {
        return classicalList;
    }
}
