package com.example.githubviewrepoowner.web;

import com.example.githubviewrepoowner.application.Service;
import com.example.githubviewrepoowner.domain.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/repos")
public class Controller {
    @Autowired
    private Service service;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public Repository[] getFoos(@RequestParam String username) {
        return service.allRepo(username);
    }

}
