package com.cherylorcutt.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public interface JokeService {

  public String getJoke();
}
