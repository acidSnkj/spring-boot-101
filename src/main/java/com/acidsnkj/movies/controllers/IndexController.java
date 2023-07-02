package com.acidsnkj.movies.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {

    @GetMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("title", "Home");
        model.addAttribute("message", "Welcome to the home page!");
        return "index";
    }

    @GetMapping(value = "/index-mv")
    public ModelAndView indexMV(ModelAndView mv) {
        mv.addObject("title", "Home");
        mv.addObject("message", "Welcome to the home page!");
        mv.setViewName("index");
        return mv;
    }

    @ModelAttribute("series")
    public List<String> getSeries() {
        return List.of("Breaking Bad", "Game of Thrones", "Friends");
    }
}
