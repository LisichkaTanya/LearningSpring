package ru.useAnatation.HomeWork2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComputerForMusic {
    private final MusicPlayer musicPlayer;

    @Autowired
    public ComputerForMusic(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void startMusicPlayer(MusicEnum musicEnum){
        switch (musicEnum){
            case CLASSICAL:
                System.out.println("Computer: " + musicPlayer.playMusic(MusicEnum.CLASSICAL));
                break;

            case ROCK:
                System.out.println("Computer: " + musicPlayer.playMusic(MusicEnum.ROCK));
                break;

            case JAZZ:
                System.out.println("Computer: " + musicPlayer.playMusic(MusicEnum.JAZZ));
        }
    }
}
