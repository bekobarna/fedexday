package com.greenfox.fedex.bigfatmoviequiz.controller;


import com.greenfox.fedex.bigfatmoviequiz.repository.QuizRepo;
import com.greenfox.fedex.bigfatmoviequiz.service.QuizService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    QuizRepo quizRepo;

    @Autowired
    QuizService quizService;

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
        ArrayList<Long> usedQuestions = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            long randomNumber = quizService.getRandomNumber();
            if (!usedQuestions.contains(randomNumber)) {
                usedQuestions.add(randomNumber);
                model.addAttribute("movies", quizRepo.findById((randomNumber)).getMovies());
                i++;
            } else {
                i++;
            }
        }
        return "quiz";
    }
}
