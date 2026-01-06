package com.Email.example.EmailAiApplication.Controller;

import com.Email.example.EmailAiApplication.dto.EmailRequest;
import com.Email.example.EmailAiApplication.dto.EmailResponse;
import com.Email.example.EmailAiApplication.service.EmailService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@RequiredArgsConstructor
public class EmailController {

    private final EmailService emailService;

    @PostMapping("/generate")
    public EmailResponse generateEmail(@Valid @RequestBody EmailRequest request) {
        return emailService.generateEmail(request);
    }
}
