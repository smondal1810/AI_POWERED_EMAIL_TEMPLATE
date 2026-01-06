package com.Email.example.EmailAiApplication.service;

import com.Email.example.EmailAiApplication.ai.AiClient;
import com.Email.example.EmailAiApplication.dto.EmailRequest;
import com.Email.example.EmailAiApplication.dto.EmailResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmailService {

    private final AiClient aiClient;

    public EmailResponse generateEmail(EmailRequest request) {

        String prompt = buildPrompt(request);

        long startTime = System.currentTimeMillis();
        String email = aiClient.generateEmail(prompt);
        long endTime = System.currentTimeMillis();

        log.info("AI call took {} ms", (endTime - startTime));

        return new EmailResponse(email);
    }

    private String buildPrompt(EmailRequest request) {
        return String.format(
                "Write a short %s email to %s for the following purpose: %s. " +
                        "Keep it customer-friendly and under 5 sentences.",
                request.getTone(),
                request.getRecipientName(),
                request.getPurpose()
        );
    }
}
