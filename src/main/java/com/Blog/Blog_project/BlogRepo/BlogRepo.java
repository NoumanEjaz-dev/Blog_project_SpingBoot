package com.Blog.Blog_project.BlogRepo;

import com.Blog.Blog_project.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepo extends JpaRepository<BlogPost , Integer> {
}
