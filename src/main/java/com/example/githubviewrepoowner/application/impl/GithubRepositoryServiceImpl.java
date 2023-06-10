package com.example.githubviewrepoowner.application.impl;

import com.example.githubviewrepoowner.application.GithubRepositoryService;
import com.example.githubviewrepoowner.domain.GithubRepository;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.stream.Collectors;


@org.springframework.stereotype.Service
class GithubRepositoryServiceImpl implements GithubRepositoryService {
    private static final String APIGITHUB = "https://api.github.com/users/";

    @Override
    public List<GithubRepository> findAllGithubRepositoryByOwnerLogin(String  login) {
        Flux<GithubRepository> githubRepositoryFlux = WebClient
                .create(APIGITHUB + login + "/repos")
                .get()
                .retrieve()
                .bodyToFlux(GithubRepository.class);

        List<GithubRepository> githubRepositories = githubRepositoryFlux
                .collect(Collectors.toList())
                .share().block();

        return githubRepositories;
    }
}

