package com.lisichka;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        /**
         * Этот класс мы получем от springframework. Этот класс обращается к файлу "applicationContext.xml",
         * считывает его (этот конфигурационных файл) и помещает все bean-ы, которые там описаны в application context
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        /**
//         * Зависимость Inversion of Control (IoC) решилась:
//         */
//        Music music = context.getBean("musicBean", Music.class);

//        /**
//         * Но мы все еще создаем зависимость Dependency Inversion вручную:
//         */
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        System.out.println(music.getSong());

        /**
         * Теперь решили все зависимости и все объекты (зависимости) создаются из конфигурационного файла
         */
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        musicPlayer1.playMusic();
        context.close();
    }
}
