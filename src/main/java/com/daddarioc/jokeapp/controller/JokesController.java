package com.daddarioc.jokeapp.controller;

import com.daddarioc.jokeapp.model.Joke;
import com.daddarioc.jokeapp.service.JokeServiceImpl;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class JokesController {

    JokeServiceImpl jokeService;

    public JokesController(JokeServiceImpl jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping(produces = MediaType.TEXT_PLAIN_VALUE)
    public String get() {
        Joke joke = jokeService.getJoke();

        return joke.getJoke();
    }
}
