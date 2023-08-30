package com.example.stalker.service;

import com.example.stalker.config.StalkerConfig;
import com.example.stalker.exception.EmptyMessageException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

/**
 * @author SteklotaraBlizz
 *
 * Service to match api with telegram api
 *
 */
@Component
@RequiredArgsConstructor
public class StalkerBotService extends TelegramLongPollingBot {

    private final StalkerConfig config;

    @Override
    public String getBotUsername() { return config.getBotName(); }

    @Override
    public String getBotToken() { return config.getBotToken(); }
    @Override
    public void onUpdateReceived(Update update) {
        if(!update.hasMessage() || !update.getMessage().hasText()){
            throw new EmptyMessageException("Wrong message");
        }
        Long id = update.getMessage().getChatId();
        String answer = "Добро пожаловать в StalkerBot! В настоящее время функционал бота находится в" +
                "разработке, stay tuned!";

        sendMessage(id, answer);
    }

    private void sendMessage(long id, String text) {
        SendMessage message = new SendMessage();

        message.setChatId(String.valueOf(id));
        message.setText(text);

        try{
            execute(message);
        } catch (TelegramApiException e) {
            //throw new RuntimeException(e);
        }

    }
}
