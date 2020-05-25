package ru.useAnnotation.HomeWork2_useJavaCod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringContext1 {

    @Bean
    public ClassicalMusic1 classicalMusic1(){
        return new ClassicalMusic1();
    }

    @Bean
    public RockMusic1 rockMusic1(){
        return new RockMusic1();
    }

    @Bean
    public JazzMusic1 jazzMusic1(){
        return new JazzMusic1();
    }

    @Bean
    public List<Music1> list(){
        return Arrays.asList(classicalMusic1(), rockMusic1(), jazzMusic1());
    }

    @Bean
    @Scope("prototype")
    public MusicPlayer1 musicPlayer1(){
        return new MusicPlayer1(list());
    }

    @Bean
    public ComputerForMusic1 computerForMusic1(){
        return new ComputerForMusic1(musicPlayer1());
    }
}
