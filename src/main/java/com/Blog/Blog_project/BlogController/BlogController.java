package com.Blog.Blog_project.BlogController;

import com.Blog.Blog_project.BlogRepo.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BlogController {

    @Autowired
    BlogRepo postRepo;

    @GetMapping("/")
    public String viewHomePage( Model model){
    model.addAttribute("postRepo", postRepo.findAll());
    return "index";
    }
}
