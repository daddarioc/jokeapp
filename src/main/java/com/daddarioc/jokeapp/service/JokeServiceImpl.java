package com.daddarioc.jokeapp.service;

import com.daddarioc.jokeapp.model.Joke;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    Joke myJoke;
    ChuckNorrisQuotes quotes;

    public JokeServiceImpl(Joke myJoke) {
        this.myJoke = myJoke;
        this.quotes = new ChuckNorrisQuotes();
    }

    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
