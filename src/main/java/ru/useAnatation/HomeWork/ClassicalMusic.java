package ru.useAnatation.HomeWork;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> classicalList = new ArrayList<>();
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
