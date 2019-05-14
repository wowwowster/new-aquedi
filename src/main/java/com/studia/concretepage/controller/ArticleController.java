package com.studia.concretepage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.studia.concretepage.entity.Article;
import com.studia.concretepage.service.ArticleService;

@RestController
@RequestMapping("user")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @GetMapping("articles")
    public List<Article> getAllArticles() {
        List<Article> list = articleService.getAllArticles();
        return list;
    }
}