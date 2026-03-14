package com.Blog.Blog_project.BlogController;

import com.Blog.Blog_project.BlogRepo.BlogRepo;
import com.Blog.Blog_project.model.BlogPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class BlogController {

    @Autowired
    BlogRepo postRepo;

    @GetMapping("/")
    public String viewHomePage( Model model){
    model.addAttribute("listPosts", postRepo.findAll());
    return "index";
    }

    @GetMapping("/new")
    public String newPost(Model model){
        model.addAttribute("post", new BlogPost());
        return "new_post";
    }

    @PostMapping("/save")
    public String savePost(@ModelAttribute("post") BlogPost post){
        postRepo.save(post);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editPost(@PathVariable int id, Model  model){
     model.addAttribute("post" , postRepo.findById(id));
     return "edit_post";
    }

    @GetMapping("/delete/{id}")
    public String DeletePost(@PathVariable int id){
        postRepo.deleteById(id);
        return "redirect:/";
    }

    @PostMapping("/update")
    public String UpdatePost(@ModelAttribute("post") BlogPost post){
        postRepo.save(post);
        return "redirect:/";
    }
}

