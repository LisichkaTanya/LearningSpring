package ru.useAnatation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComputerForMovie {
    private MoviePlayer moviePlayer;

    @Autowired
    public ComputerForMovie(MoviePlayer moviePlayer) {
        this.moviePlayer = moviePlayer;
    }

    @Override
    public String toString() {
        return "Computer: " +
                 moviePlayer.playMovie();
    }
}
