package ru.itis.cloud.news.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.cloud.news.model.News;
import ru.itis.cloud.news.repositories.NewsRepository;

import java.util.List;
import java.util.Optional;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsRepository newsRepository;


    @Override
    public List<News> findAllNews() {
        return newsRepository.findAll();
    }

    @Override
    public Optional<News> findByID(Long id) {
        Optional<News> newsCandidate = newsRepository.findById(id);
        if (newsCandidate.isPresent()) {
            News news = newsCandidate.get();
            return Optional.of(news);
        } else {
            return Optional.empty();
        }
    }
}
