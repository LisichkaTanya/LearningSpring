package ru.useAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringWithAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContextAnnotation.xml");
        ComputerForMovie computerForMovie = context.getBean("computerForMovie", ComputerForMovie.class);
        System.out.println(computerForMovie);


//        Movie detectiveMovie = context.getBean("detective", Detective.class);
//        MoviePlayer moviePlayer2 = new MoviePlayer(detectiveMovie);
//        moviePlayer2.playMovie();
        context.close();
    }
}
