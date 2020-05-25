package ru.useAnnotation.HomeWork2_useJavaCod;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpringHomeWork1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringContext1.class);

        ComputerForMusic1 computerForMusic1 = context.getBean("computerForMusic1", ComputerForMusic1.class);
        computerForMusic1.startMusicPlayer();

        context.close();
    }
}
