package com.example.githubviewrepoowner.application;

import com.example.githubviewrepoowner.domain.GithubRepository;
public interface Service {
    GithubRepository[] findAllGithubRepositoryByOwnerLogin(String  login);
}
