package com.example.config;

import com.example.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Game game() { // The bean is named "game"
        return new BaseballGame(redSox(), cubs());
    }

    @Bean
    public Team redSox() {
        return new RedSox();
    }

    @Bean Team cubs() {
        return new Cubs();
    }
}
