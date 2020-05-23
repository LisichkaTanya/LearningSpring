package ru.useAnatation.HomeWork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2){
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(MusicEnum musicEnum) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        if (musicEnum == MusicEnum.CLASSICAL){
            return "Playing: " + music1.getSong().get(randomNumber);
        }
        else {
            return "Playing: " + music2.getSong().get(randomNumber);
        }
    }
}
