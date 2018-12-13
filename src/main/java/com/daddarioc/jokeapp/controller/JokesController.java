package com.daddarioc.jokeapp.controller;

import com.daddarioc.jokeapp.model.Joke;
import com.daddarioc.jokeapp.service.JokeServiceImpl;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping({"/", ""})
public class JokesController {

    JokeServiceImpl jokeService;

    public JokesController(JokeServiceImpl jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping
    public String get(Model model) {
        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }
}
