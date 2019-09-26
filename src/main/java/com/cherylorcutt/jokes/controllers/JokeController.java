package com.cherylorcutt.jokes.controllers;

import com.cherylorcutt.jokes.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Controller registers as a Spring Bean and Controller
 */
@Controller
public class JokeController {

  private JokeService jokeService;

  // having @Autowired here is optional
  @Autowired
  public JokeController(JokeService jokeService) {
    this.jokeService = jokeService;
  }

  @RequestMapping({"/", ""})
  public String getJoke(Model model) {
    model.addAttribute("joke", jokeService.getJoke());
    return "/chucknorris"; // thymeleaf view
  }

}
