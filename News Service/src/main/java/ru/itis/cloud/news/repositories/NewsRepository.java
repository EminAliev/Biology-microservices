package ru.itis.cloud.news.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.cloud.news.model.News;

public interface NewsRepository extends JpaRepository<News, Long> {
}