package ru.itis.cloud.themes.service;

import ru.itis.cloud.themes.dto.ThemeDto;

import java.util.List;

public interface ThemeService {
    List<ThemeDto> listThemes();
}