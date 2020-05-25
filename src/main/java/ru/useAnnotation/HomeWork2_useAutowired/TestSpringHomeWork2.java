package ru.useAnnotation.HomeWork2_useAutowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpringHomeWork2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringContext2.class);

        ComputerForMusic2 computerForMusic2 = context.getBean("computerForMusic2", ComputerForMusic2.class);
        computerForMusic2.startMusicPlayer();

        context.close();
    }
}
