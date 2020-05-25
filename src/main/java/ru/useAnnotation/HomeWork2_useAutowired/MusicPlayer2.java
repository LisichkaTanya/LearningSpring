package ru.useAnnotation.HomeWork2_useAutowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
@Component
@Scope("prototype")
public class MusicPlayer2 {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    List<Music2> genreList;

    @Autowired
    public MusicPlayer2(List<Music2> genreList){
        this.genreList = genreList;
    }

    public String playMusic(MusicEnum2 musicEnum2) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        String song = "song";
        switch (musicEnum2) {
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
