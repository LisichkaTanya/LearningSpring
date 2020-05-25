package ru.useAnnotation.HomeWork2_useJavaCod;

import java.util.Random;

public class ComputerForMusic1 {
    private final MusicPlayer1 musicPlayer1;

    public ComputerForMusic1(MusicPlayer1 musicPlayer1) {
        this.musicPlayer1 = musicPlayer1;
    }

    public void startMusicPlayer(){
        Random random = new Random();
        MusicEnum1[] genre = {MusicEnum1.CLASSICAL, MusicEnum1.ROCK, MusicEnum1.JAZZ};
        int randomNumber = random.nextInt(3);
        System.out.println("Computer: " + musicPlayer1.playMusic(genre[randomNumber]));
    }
}
