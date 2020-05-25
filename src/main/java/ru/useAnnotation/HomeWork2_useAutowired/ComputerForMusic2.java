package ru.useAnnotation.HomeWork2_useAutowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ComputerForMusic2 {
    private final MusicPlayer2 musicPlayer2;

    @Autowired
    public ComputerForMusic2(MusicPlayer2 musicPlayer2) {
        this.musicPlayer2 = musicPlayer2;
    }

    public void startMusicPlayer(){
        Random random = new Random();
        MusicEnum2[] genre = {MusicEnum2.CLASSICAL, MusicEnum2.ROCK, MusicEnum2.JAZZ};
        int randomNumber = random.nextInt(3);
        System.out.println("Computer: " + musicPlayer2.playMusic(genre[randomNumber]));
    }
}
