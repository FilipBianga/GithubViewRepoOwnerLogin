package com.example.githubviewrepoowner.web;

import com.example.githubviewrepoowner.application.Service;
import com.example.githubviewrepoowner.domain.GithubRepository;
import com.example.githubviewrepoowner.exception.ApiError;
import com.example.githubviewrepoowner.exception.ResponseEntityBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping("/repos")
class Controller {
    @Autowired
    private Service service;


    @RequestMapping(value = "/all", method = RequestMethod.GET, headers = {"Accept=application/json"})
    public GithubRepository[] getAllRepoOwnerLogin(@RequestParam String login) {
        return service.findAllGithubRepositoryByOwnerLogin(login);
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public final ResponseEntity<Object> handleException() {
        ApiError err = new ApiError(
                HttpStatus.NOT_FOUND,
                "This Owner Login doesn't exist in Github");

        return ResponseEntityBuilder.build(err);
    }


}
