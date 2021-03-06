package ru.itis.cloud.news.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itis.cloud.news.model.News;
import ru.itis.cloud.news.service.NewsService;

import java.util.List;

@Controller
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping("/news")
    public List<News> getNews() {
        return newsService.findAllNews();
    }

}