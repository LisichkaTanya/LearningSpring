package ru.useAnatation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private MoviePlayer moviePlayer;

    @Autowired
    public Computer(MoviePlayer moviePlayer) {
        this.moviePlayer = moviePlayer;
    }

    @Override
    public String toString() {
        return "Computer: " +
                 moviePlayer.playMovie();
    }
}
