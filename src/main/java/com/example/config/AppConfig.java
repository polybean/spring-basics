package com.example.config;

import com.example.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {
    @Autowired
    private DataSource dataSource;

    @Autowired
    @Qualifier("redSox")
    private Team home;

    @Autowired
    @Qualifier("cubs")
    private Team away;

    @Bean
    public Game game() { // The bean is named "game"
        BaseballGame baseballGame = new BaseballGame(home, away);
        baseballGame.setDataSource(dataSource);
        return baseballGame;
    }
}
