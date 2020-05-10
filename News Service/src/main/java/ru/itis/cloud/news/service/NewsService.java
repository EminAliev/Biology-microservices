package ru.itis.cloud.news.service;

import ru.itis.cloud.news.model.News;

import java.util.List;
import java.util.Optional;

public interface NewsService {
    List<News> findAllNews();

    Optional<News> findByID(Long id);
}
