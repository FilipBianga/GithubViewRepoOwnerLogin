package com.example.githubviewrepoowner.application;

import com.example.githubviewrepoowner.domain.Repository;

public interface Service {

    Repository[] allRepo(String username);
}
