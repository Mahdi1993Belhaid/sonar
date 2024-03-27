package com.example.tddproject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

 class TestPostMessage {
    private LocalDateTime now;
    private Message message = new Message();
    private PosteMessageUseCse posteMessageUseCse ;
    @Test
     void testMessageNeDepassePas280Characteres(){
        givenNowsIs(LocalDateTime.of(2023,1,18,23,0));
        posteMessageUseCse = new PosteMessageUseCse(message,now);
        whenUserPostMessage(new MessageDto("123","hello frends","mahdi"));
        thenPostedMessageShouldBe(new Message("123","hello frends","mahdi",LocalDateTime.of(2023,1,18,23,0)));
    }

    public void givenNowsIs(LocalDateTime now){
        this.now = now ;
    }




    public void whenUserPostMessage(MessageDto message){
     posteMessageUseCse.handle(message);
    }

    public void thenPostedMessageShouldBe(Message message){
        Assertions.assertThat(this.message.getMessageId()).isEqualTo(message.getMessageId());
        Assertions.assertThat(this.message.getAuthor()).isEqualTo(message.getAuthor());
        Assertions.assertThat(this.message.getText()).isEqualTo(message.getText());
        Assertions.assertThat(this.message.getPublishedAt()).isEqualTo(message.getPublishedAt());
    }

}
