package com.example;

import com.example.config.AppConfig;
import com.example.entities.Game;
import com.example.entities.Royals;
import com.example.entities.Team;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RunDemo {

    private static Team team = new Royals();

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Game game = context.getBean("game", Game.class);
        game.setAwayTeam(team);
        String winner = game.playGame();
        System.out.println(winner + " won");

        System.out.println(context.getBeanDefinitionCount());

        for (String name: context.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }
}
