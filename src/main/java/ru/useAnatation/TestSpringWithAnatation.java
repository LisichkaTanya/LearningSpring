package ru.useAnatation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringWithAnatation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContextAnatation.xml");
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

//        Movie detectiveMovie = context.getBean("detective", Detective.class);
//        MoviePlayer moviePlayer2 = new MoviePlayer(detectiveMovie);
//        moviePlayer2.playMovie();
    }
}
