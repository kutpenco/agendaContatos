package br.com.madrugas.agenda.config;

import java.util.Collections;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;

import io.swagger.models.auth.In;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiKey;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SpringFoxConfig {
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2).securitySchemes(Arrays.asList(new ApiKey("Autenticao", HttpHeaders.AUTHORIZATION, In.HEADER.name())))
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("br.com.madrugas.agenda.controller"))
          .paths(PathSelectors.any())
          .build();
    }
}