package ru.useAnatation;

import org.springframework.stereotype.Component;


public class Detective implements Movie {
    @Override
    public String getMovie() {
        return "Play detective movie";
    }
}
