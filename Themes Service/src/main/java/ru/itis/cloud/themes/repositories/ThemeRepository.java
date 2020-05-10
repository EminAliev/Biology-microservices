package ru.itis.cloud.themes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.cloud.themes.model.Theme;

public interface ThemeRepository extends JpaRepository<Theme, Long> {
}