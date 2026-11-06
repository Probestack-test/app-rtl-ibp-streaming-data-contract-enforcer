package com.probestack.forgestudio.design.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "com.probestack.forgestudio.design.config.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Streaming Data Contract Enforcer")
                                .description("Enforces data contracts between Kafka producers and consumers. Prevents  the #1 cause of streaming pipeline outages: silent schema changes that  break downstream consumers. Every message produced to a topic is validated  against a registered contract before being published. Breaking changes  require explicit consumer acknowledgment, ensuring no surprises in  production. Supports Avro, Protobuf, and JSON Schema formats. ")
                                .contact(
                                        new Contact()
                                                .name("ForgeSphere Data Platform")
                                                .email("data-platform@forgesphere.example.com")
                                )
                                .version("1.0.0")
                )
                .components(
                        new Components()
                                .addSecuritySchemes("bearerAuth", new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")
                                )
                )
        ;
    }
}
