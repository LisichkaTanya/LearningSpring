package ru.useAnatation.HomeWork;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringHomeWork {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContextAnatation.xml");

        ComputerForMusic computerForMusic = context.getBean("computerForMusic", ComputerForMusic.class);
        computerForMusic.startMusicPlayer(MusicEnum.CLASSICAL);
        computerForMusic.startMusicPlayer(MusicEnum.ROCK);

        context.close();
    }
}
