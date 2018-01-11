package com.greenfox.fedex.bigfatmoviequiz.controller;

import com.greenfox.fedex.bigfatmoviequiz.repository.MovieRepo;
import com.greenfox.fedex.bigfatmoviequiz.repository.QuizRepo;
import com.greenfox.fedex.bigfatmoviequiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

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
        score = 0;
        return "index";
    }

    @PostMapping("/quiz")
    public String quizPost(){
        return "redirect:/quiz";
    }

    @GetMapping("/quiz")
    public String quiz(Model model, @RequestParam(defaultValue = "0") int page) {
        model.addAttribute("movies", movieRepo.findAll(new PageRequest(page, 1)));
        model.addAttribute("currentPage", page);
        return page < 10 ? "quiz" : "redirect:/score";
    }

    @GetMapping("/score")
    public String score(Model model){
        model.addAttribute("score", score);
        score = 0;
        return "score";
    }

    @GetMapping("/up")
    public String up(HttpServletRequest request){
        score++;
        String referuri = request.getHeader("referer");
        String page = referuri.substring(referuri.length()-1);
        int pagee = 1;
        if (!page.equals("z")){
            pagee = Integer.parseInt(page);
            pagee++;
        }
        return page.charAt(page.length()-1) == 'z' ? "redirect:/quiz/?page=1" : "redirect:/quiz/?page=" + pagee;
    }

    @GetMapping("/nada")
    public String nada(HttpServletRequest request){
        String referuri = request.getHeader("referer");
        String page = referuri.substring(referuri.length()-1);
        int pagee = 1;
        if (!page.equals("z")){
            pagee = Integer.parseInt(page);
            pagee++;
        }
        return page.charAt(page.length()-1) == 'z' ? "redirect:/quiz/?page=1" : "redirect:/quiz/?page=" + pagee;
    }

}
