package telegram;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class TelegramBotHuExample extends TelegramLongPollingBot {
    RequestHandler requestHandler = new RequestHandler();

    public String getBotUsername() {
        return "HungaryCourseBot";
    }

    public String getBotToken() {
        return "6918641174:AAGWPrDx1vdmJoDDswxAuZWtKpEz_5NsY5c";
    }

    public void onUpdateReceived(Update update) {
        SendMessage sendMessage = requestHandler.handleTelegramRequest(update);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }




}
