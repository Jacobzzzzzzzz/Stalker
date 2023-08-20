package com.example.stalker.config;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data
@PropertySource("appbot.properties")
public class StalkerConfig {

    @Value("${bot.name}")
    String botName;

    @Value("${bot.token}")
    String botToken;
}
