package com.example.githubviewrepoowner.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Repository {

    private OwnerLogin owner;
    private String name;
    private Boolean fork;
    private String branches_url;
}
