package com.example.stalker.service;

import com.example.stalker.config.StalkerConfig;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

/*
 * @author SteklotaraBlizz
 *
 * Service to match api with telegram api
 *
 */
@Component
public class StalkerBotService extends TelegramLongPollingBot {

    final StalkerConfig config;
    public StalkerBotService(StalkerConfig stalkerConfig) { this.config = stalkerConfig; }

    @Override
    public String getBotUsername() { return config.getBotName(); }

    @Override
    public String getBotToken() { return config.getBotToken(); }

    @Override
    public void onUpdateReceived(Update update) {
        //todo
    }
}
