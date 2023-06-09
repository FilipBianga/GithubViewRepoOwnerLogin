package com.example.githubviewrepoowner.application.impl;

import com.example.githubviewrepoowner.application.Service;
import com.example.githubviewrepoowner.domain.GithubRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;


@org.springframework.stereotype.Service
@AllArgsConstructor
class ServiceImpl implements Service {
    private static final String APIGITHUB = "https://api.github.com/users/";
    @Autowired
    RestTemplate restTemplate;

    @Override
    public GithubRepository[] findAllGithubRepositoryByOwnerLogin(String  login) {
        return restTemplate.getForObject(APIGITHUB + login + "/repos", GithubRepository[].class);
    }
}

