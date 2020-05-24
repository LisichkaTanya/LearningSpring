package ru.useAnatation.HomeWork2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private String name;
    private int volume;
    List<Music> genreList = new ArrayList<>();

    @Autowired
    public MusicPlayer(List<Music> genreList){
        this.genreList = genreList;
    }

    public String playMusic(MusicEnum musicEnum) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        String song = "song";
        switch (musicEnum) {
            case CLASSICAL:
                song = "Playing: " + genreList.get(0).getSong().get(randomNumber);
            break;

            case ROCK:
                song = "Playing: " + genreList.get(1).getSong().get(randomNumber);
            break;

            case JAZZ:
                song = "Playing: " + genreList.get(2).getSong().get(randomNumber);
            break;
        }
        return song;
    }
}
