# AI-Powered Email Template Generator

## Problem Statement
This project implements a backend microservice that generates short, customer-friendly email templates based on a few input fields.  
The service is designed to demonstrate clean backend architecture, modular structure, AI prompt handling, and response time logging as required by the assignment.

---

## Technology Stack
- Java 17
- Spring Boot 3.5.9
- Maven
- Spring Web
- Lombok
- JAR packaging
- application.properties
- IntelliJ IDEA
- Windows 10

---

## Development Environment
- IDE: IntelliJ IDEA
- OS: Windows 10
- Build Tool: Maven
- Java Version: 17
- Spring Boot Version: 3.5.9

---

## How to Run the Application
-- From run button

### Prerequisites
- Java 17 or higher
- Maven
- Git

---

### Environment Variable Setup
The application reads the AI API key from an environment variable to avoid hardcoding sensitive information.

#### Windows
```bash
setx AI_API_KEY "dummy_key"

### Request Body:
{
  "purpose": "inform about account approval",
  "recipientName": "John",
  "tone": "friendly"
}
### Sample API Response:
{
  "email": "Hi there,\n\nThank you for reaching out. We appreciate your interest and will get back to you shortly.\n\nBest regards."
}
### log output:

AI call took 0 ms


EmailAiApplication
 ├── pom.xml
 └── src
     └── main
         ├── java
         │   └── com
         │       └── Email
         │           └── example
         │               └── EmailAiApplication
         │                   ├── EmailAiApplication.java
         │                   ├── Controller
         │                   │   └── EmailController.java
         │                   ├── service
         │                   │   └── EmailService.java
         │                   ├── ai
         │                   │   └── AiClient.java
         │                   └── dto
         │                       ├── EmailRequest.java
         │                       └── EmailResponse.java
         └── resources
             └── application.properties




