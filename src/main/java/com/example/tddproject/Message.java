package com.example.tddproject;

import java.time.LocalDateTime;

public class Message{
    private String messageId;
    private String text;
    private String author;
    private LocalDateTime publishedAt;

    public Message() {}
    public Message(String messageId,String text,String author,LocalDateTime publishedAt){
        this.messageId = messageId;
        this.author = author ;
        this.text = text ;
        this.publishedAt = publishedAt ;

    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(LocalDateTime publishedAt) {
        this.publishedAt = publishedAt;
    }
}


