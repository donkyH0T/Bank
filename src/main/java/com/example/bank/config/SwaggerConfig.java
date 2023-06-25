package com.example.bank.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Bank",
                description = "Bank info", version = "1.0.0",
                contact = @Contact(
                        name = "Kurenkov Vyacheslav and Grisha Anisimov",
                        email = "slava.kurenkov@bk.ru"
                )
        )
)
public class SwaggerConfig {
}
