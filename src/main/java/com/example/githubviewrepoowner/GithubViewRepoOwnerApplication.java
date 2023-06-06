package com.example.githubviewrepoowner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GithubViewRepoOwnerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubViewRepoOwnerApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
