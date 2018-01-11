package com.greenfox.fedex.bigfatmoviequiz.controller;

import com.greenfox.fedex.bigfatmoviequiz.repository.MovieRepo;
import com.greenfox.fedex.bigfatmoviequiz.repository.QuizRepo;
import com.greenfox.fedex.bigfatmoviequiz.service.QuizService;
import java.util.ArrayList;
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
    QuizService quizService;
    
   @Autowired
    MovieRepo movieRepo;

    int score;

    @GetMapping({"/",""})
    public String index(){
        return "index";
    }

    @PostMapping("/quiz")
    public String quizPost(){
        return "redirect:/quiz";
    }

    @GetMapping("/quiz")
    public String quiz(Model model, @RequestParam(defaultValue = "0") int page) {

//        ArrayList<Long> usedQuestions = new ArrayList<>();
//        for (int i = 0; i < 9; i++) {
//            long randomNumber = quizService.getRandomNumber();
//            if (!usedQuestions.contains(randomNumber)) {
//                usedQuestions.add(randomNumber);
//                model.addAttribute("movies2", quizRepo.findById((randomNumber)).getMovies());
//                i++;
//            } else {
//                i++;
//            }
//       }
        score++;
        model.addAttribute("movies", movieRepo.findAll(new PageRequest(page, 1)));
        model.addAttribute("currentPage", page);

        return page <= 10 ? "quiz" : "score";
    }

    @GetMapping("/score")
    public String score(Model model){
        model.addAttribute("score", score);
        return "score";
    }

}
