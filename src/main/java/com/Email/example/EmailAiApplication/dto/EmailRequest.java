package com.Email.example.EmailAiApplication.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmailRequest {

    @NotBlank
    private String purpose;

    @NotBlank
    private String recipientName;

    @NotBlank
    private String tone;
}
