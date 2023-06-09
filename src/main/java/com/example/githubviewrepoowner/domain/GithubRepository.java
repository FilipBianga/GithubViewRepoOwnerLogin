package com.example.githubviewrepoowner.domain;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GithubRepository {

    private Login owner;
    private String name;
    private Boolean fork;
    private String branches_url;
}
