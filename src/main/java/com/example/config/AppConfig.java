package com.example.config;

import com.example.entities.BaseballGame;
import com.example.entities.Game;
import com.example.entities.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.sql.DataSource;
import java.text.NumberFormat;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.example")
@EnableAspectJAutoProxy
public class AppConfig {
    @Autowired
    private DataSource dataSource;

    @Autowired
    private List<Team> teams;

    @Bean
    public NumberFormat nf() {
        return NumberFormat.getCurrencyInstance();
    }

    @Bean
    public Game game() { // The bean is named "game"
        BaseballGame baseballGame = new BaseballGame(teams.get(0),teams.get(1));
        baseballGame.setDataSource(dataSource);
        return baseballGame;
    }
}
