package com.Blog.Blog_project.model;

import jakarta.persistence.*;


@Entity
@Table(name = "blog_post")
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Title")
    private String title;
    @Column(name = "Content")
    private String content;
    @Column(name = "Author")
    private String author;

    public BlogPost() {
    }

    public BlogPost(int id, String title, String content, String author) {
        this.id = id;
        this.title = title;
        this.content= content;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
