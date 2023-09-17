package com.chagpt.ChatbotSample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class ChatGptResponse {

    private List<Choice> choiceList;


}
