package ru.useAnatation;

import org.springframework.stereotype.Component;

@Component
public class Comedy implements Movie {
    @Override
    public String getMovie() {
        return "Play comedy movie";
    }
}
