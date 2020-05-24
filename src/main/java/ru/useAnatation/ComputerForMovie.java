package ru.useAnatation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.*;

@Component
public class ComputerForMovie {
    private MoviePlayer moviePlayer;

    @Autowired
    public ComputerForMovie(MoviePlayer moviePlayer) {
        this.moviePlayer = moviePlayer;
    }

    @PostConstruct
    public void myInit() {
        System.out.println("Doing my initialisation");
    }

    @PreDestroy
    public void myDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String toString() {
        return "Computer: " +
                 moviePlayer.playMovie();
    }
}
