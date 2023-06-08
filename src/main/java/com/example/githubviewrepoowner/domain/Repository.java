package com.example.githubviewrepoowner.domain;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Repository {

    private long id;
    private OwnerLogin owner;
    private String name;

    private Boolean fork;

    private String branches_url;
}
