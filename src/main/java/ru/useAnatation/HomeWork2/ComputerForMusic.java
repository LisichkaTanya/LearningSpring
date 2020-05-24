package ru.useAnatation.HomeWork2;

import java.util.Random;

public class ComputerForMusic {
    private final MusicPlayer musicPlayer;

    public ComputerForMusic(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void startMusicPlayer(){
        Random random = new Random();
        MusicEnum[] genre = {MusicEnum.CLASSICAL, MusicEnum.ROCK, MusicEnum.JAZZ};
        int randomNumber = random.nextInt(3);
        System.out.println("Computer: " + musicPlayer.playMusic(genre[randomNumber]));
    }
}
