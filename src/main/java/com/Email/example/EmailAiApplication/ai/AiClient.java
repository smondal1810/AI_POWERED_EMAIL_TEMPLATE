package com.Email.example.EmailAiApplication.ai;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;


@Component
public class AiClient {



    @Value("${ai.api.key:dummy_key}")
    private String apiKey;

    public String generateEmail(String prompt) {
        // Mock AI response (acceptable for assignment)
        return "Hi there,\n\nThank you for reaching out. " +
                "We appreciate your interest and will get back to you shortly.\n\nBest regards.";
    }
}
