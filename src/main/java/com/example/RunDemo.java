package com.example;

import com.example.config.AppConfig;
import com.example.entities.Game;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Game game = context.getBean("game", Game.class);
        String winner = game.playGame();
        System.out.println(winner + " won");

        System.out.println(context.getBeanDefinitionCount());

        for (String name: context.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }
}
