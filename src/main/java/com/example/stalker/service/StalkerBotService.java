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
        commandSelector(id, update.getMessage().getText());
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

    private void commandSelector(Long id, String command){
        String answer;
        switch(command){

            case "/start":
                answer = "Добро пожаловать в StalkerBot! Сами вы его выбрали, или его выбрали за вас,"+
                         "это лучший из всех имеющихся бот для слежки за людьми и сравнением их с собой любимым:). " +
                         "Введите /help, чтобы перейти к списку команд";
                break;
            case "/help":
                answer = "/stalk - посмотреть, чем увлекается человек (по его id) \n" +
                         "/compare - узнать совпадение ваших интересов с интересами другого человека (по его id) \n" +
                         "Остальной функционал в разработке";
                break;
            default:
                answer = "Не знаю такой команды( \n" + "Попробуй снова";
                break;
        }
        sendMessage(id, answer);
    }
}
