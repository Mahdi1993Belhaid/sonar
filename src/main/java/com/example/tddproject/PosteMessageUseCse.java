package com.example.tddproject;

import java.time.LocalDateTime;

public class PosteMessageUseCse{
    private Message message;
    private LocalDateTime now;
    public PosteMessageUseCse(Message message,LocalDateTime now){
        this.message=message;
        this.now = now;
    }
    public void handle(MessageDto messageDto){
        this.message.setMessageId(messageDto.messageId());
        this.message.setAuthor(messageDto.author());
        this.message.setText(messageDto.text());
        this.message.setPublishedAt(this.now);
    }
}
