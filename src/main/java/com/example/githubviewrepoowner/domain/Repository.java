package com.example.githubviewrepoowner.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Repository {

    private long id;
    private String name;
    private String description;
    private String fork;
}
