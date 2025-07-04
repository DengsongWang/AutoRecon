package com.autorecon.backend.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .servers(List.of(
                        new Server()
                                .url("http://localhost:8080/api")
                                .description("Local development server")
                ))
                .info(new Info()
                        .title("AutoRecon API")
                        .description("AI-Enhanced Financial Reconciliation System")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("AutoRecon development team")
                                .email("2**********s@gmail.com")
                                .url("https://github.com/DengsongWang/AutoRecon")
                    )
                );
    }
}
