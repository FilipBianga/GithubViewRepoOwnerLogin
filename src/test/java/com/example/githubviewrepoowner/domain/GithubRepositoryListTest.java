package com.example.githubviewrepoowner.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


class GithubRepositoryListTest {

    private GithubRepositoryList githubRepositoryList;

    @BeforeEach
    void initOrder() {
        githubRepositoryList = new GithubRepositoryList(List.of());
    }


    @Test
    void githubRepositoryListShouldBeEmpty() {
        assertThat(githubRepositoryList.githubRepositoryList().size(), equalTo(0));
        assertThat(githubRepositoryList.githubRepositoryList(), hasSize(0));
        assertThat(githubRepositoryList.githubRepositoryList(), emptyCollectionOf(GithubRepository.class));
    }

}