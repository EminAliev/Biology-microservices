package ru.itis.cloud.themes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.cloud.themes.dto.ThemeDto;
import ru.itis.cloud.themes.model.Theme;
import ru.itis.cloud.themes.repositories.ThemeRepository;

import java.util.List;


@Service
public class ThemeServiceImpl implements ThemeService {

    @Autowired
    private ThemeRepository themeRepository;

    @Override
    public List<ThemeDto> listThemes() {
        List<Theme> themes = themeRepository.findAll();
        return ThemeDto.from(themes);
    }
}
