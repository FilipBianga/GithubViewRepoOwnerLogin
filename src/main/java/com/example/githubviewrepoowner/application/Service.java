package com.example.githubviewrepoowner.application;

import com.example.githubviewrepoowner.domain.Repository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class Service {
    private static final String APIGITHUB = "https://api.github.com/users/";

    @Autowired
    RestTemplate restTemplate;


    public Repository[] allRepo(String username) {
        return restTemplate.getForObject(APIGITHUB + username + "/repos", Repository[].class);
    }
}
