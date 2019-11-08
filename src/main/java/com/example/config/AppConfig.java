package com.example.config;

import com.example.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

@Configuration
@Import(InfrastructureConfig.class)
public class AppConfig {
    @Autowired
    private DataSource dataSource;

    @Bean
    public Game game() { // The bean is named "game"
        BaseballGame baseballGame = new BaseballGame(redSox(), cubs());
        baseballGame.setDataSource(dataSource);
        return baseballGame;
    }

    @Bean
    public Team redSox() {
        return new RedSox();
    }

    @Bean Team cubs() {
        return new Cubs();
    }
}
