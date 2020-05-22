package ru.useAnatation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MoviePlayer {
    private Movie movie;

    @Autowired
    public MoviePlayer(Movie movie){
        this.movie = movie;
    }

    public String playMovie() {
        return movie.getMovie();
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
