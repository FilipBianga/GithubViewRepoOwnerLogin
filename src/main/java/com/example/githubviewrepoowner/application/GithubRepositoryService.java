package com.example.githubviewrepoowner.application;

import com.example.githubviewrepoowner.domain.GithubRepository;

import java.util.List;

public interface GithubRepositoryService {
    List<GithubRepository> findAllGithubRepositoryByOwnerLogin(String  login);
}
