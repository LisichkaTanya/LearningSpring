package ru.useAnatation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringWithAnatation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContextAnatation.xml");
        ComputerForMovie computerForMovie = context.getBean("computerForMovie", ComputerForMovie.class);
        System.out.println(computerForMovie);


//        Movie detectiveMovie = context.getBean("detective", Detective.class);
//        MoviePlayer moviePlayer2 = new MoviePlayer(detectiveMovie);
//        moviePlayer2.playMovie();
        context.close();
    }
}
