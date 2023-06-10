package com.example.githubviewrepoowner.domain;

public record GithubRepository(GithubLogin owner, String name, Boolean fork, String branches_url) {
}
