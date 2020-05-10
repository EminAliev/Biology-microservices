package ru.itis.cloud.themes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.cloud.themes.dto.ThemeDto;
import ru.itis.cloud.themes.service.ThemeService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ThemeController {

    @Autowired
    private ThemeService themeService;

    @GetMapping("/theme")
    public List<ThemeDto> getThemes() {
        return themeService.listThemes();
    }

}