package ru.useAnatation.HomeWork;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> rockList = new ArrayList<>();
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
