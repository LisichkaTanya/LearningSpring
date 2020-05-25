package ru.useAnnotation.HomeWork2_useJavaCod;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class MusicPlayer1 {

    @Value("${musicPlayer1.name}")
    private String name;
    @Value("${musicPlayer1.volume}")
    private int volume;
    List<Music1> genreList;

    public MusicPlayer1(List<Music1> genreList){
        this.genreList = genreList;
    }

    public String playMusic(MusicEnum1 musicEnum1) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        String song = "song";
        switch (musicEnum1) {
            case CLASSICAL:
                song = "Playing: " + genreList.get(0).getSong().get(randomNumber) + " " +
                name + " volume: " + volume;
            break;

            case ROCK:
                song = "Playing: " + genreList.get(1).getSong().get(randomNumber) + " " +
                name + " volume: " + volume;
            break;

            case JAZZ:
                song = "Playing: " + genreList.get(2).getSong().get(randomNumber) + " " +
                name + " volume: " + volume;
            break;
        }
        return song;
    }
}
