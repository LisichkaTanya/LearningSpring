package ru.useAnatation.HomeWork2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpringHomeWork2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringContext.class);

        ComputerForMusic computerForMusic = context.getBean("computerForMusic", ComputerForMusic.class);
        computerForMusic.startMusicPlayer();

        context.close();
    }
}
