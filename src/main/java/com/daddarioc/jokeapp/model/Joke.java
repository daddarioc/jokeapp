package com.daddarioc.jokeapp.model;

import org.springframework.stereotype.Component;

@Component
public class Joke {
    private String joke;

    public Joke() {}

    public Joke(String joke) {
        this.joke = joke;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    @Override
    public String toString() {
        return joke;
    }
}
