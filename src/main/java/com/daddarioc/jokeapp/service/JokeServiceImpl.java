package com.daddarioc.jokeapp.service;

import com.daddarioc.jokeapp.model.Joke;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    Joke myJoke;
    ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl(Joke myJoke, ChuckNorrisQuotes chuckNorrisQuotes) {
        this.myJoke = myJoke;
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
