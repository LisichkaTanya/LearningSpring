package ru.useAnnotation.HomeWork;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
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
