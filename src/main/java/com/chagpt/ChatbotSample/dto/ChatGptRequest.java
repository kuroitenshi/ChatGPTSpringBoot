package com.chagpt.ChatbotSample.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ChatGptRequest {

    private String model;
    private List<Message> messageList;

    public ChatGptRequest(String model, String prompt) {
        this.model = model;
        this.messageList = new ArrayList<>();
        this.messageList.add(new Message("user", prompt));
    }
}
