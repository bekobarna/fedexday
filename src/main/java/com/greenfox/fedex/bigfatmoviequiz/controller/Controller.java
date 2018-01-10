package com.greenfox.fedex.bigfatmoviequiz.controller;

import com.greenfox.fedex.bigfatmoviequiz.repository.MovieRepo;
import com.greenfox.fedex.bigfatmoviequiz.repository.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    QuizRepo quizRepo;

    @Autowired
    MovieRepo movieRepo;


    @GetMapping({"/",""})
    public String index(){
        return "index";
    }

    @PostMapping("/quiz")
    public String quizPost(){
        return "redirect:/quiz";
    }

    @GetMapping("/quiz")
    public String quiz(Model model, @RequestParam(defaultValue = "0") int page){
        model.addAttribute("movies", movieRepo.findAll(new PageRequest(page, 1)));
        model.addAttribute("currentPage", page);
        return "quiz";
    }


}
