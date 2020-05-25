package ru.useAnnotation.HomeWork2_useAutowired;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.useAnnotation.HomeWork2_useAutowired")
@PropertySource("classpath:musicPlayer.properties")
public class SpringContext2 {
}
