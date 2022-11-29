package com.taskman.mytasks.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("mytasks")
                .pathsToMatch("/**","/swagger-ui/**", "/v3/api-docs/**")
                .packagesToScan("com.taskman")
                .build();
    }
}