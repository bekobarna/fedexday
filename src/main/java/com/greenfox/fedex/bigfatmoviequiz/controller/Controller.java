package com.greenfox.fedex.bigfatmoviequiz.controller;


import com.greenfox.fedex.bigfatmoviequiz.repository.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    QuizRepo quizRepo;

    @GetMapping({"/",""})
    public String index(){
        return "index";
    }

    @PostMapping("/quiz")
    public String quizPost(){
        return "redirect:/quiz";
    }

    @GetMapping("quiz")
    public String quiz(Model model){
        model.addAttribute("movies", quizRepo.findById((long) 1).getMovies());
        return "quiz";
    }
}
