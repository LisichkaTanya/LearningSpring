package ru.useAnatation.HomeWork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ComputerForMusic {
    private final MusicPlayer musicPlayer;

    @Autowired
    public ComputerForMusic(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void startMusicPlayer(MusicEnum musicEnum){
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        if (musicEnum == MusicEnum.CLASSICAL){
            System.out.println("Computer: " + musicPlayer.playMusic(MusicEnum.CLASSICAL));
        }
        else {
            System.out.println("Computer: " + musicPlayer.playMusic(MusicEnum.ROCK));
        }
    }

//    @Override
//    public String toString() {
//        return "Computer " + musicPlayer.playMusic(MusicEnum.CLASSICAL);
//    }
}
