package com.example.githubviewrepoowner.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GithubRepositoryList {
    private GithubRepository[] repos;
}
