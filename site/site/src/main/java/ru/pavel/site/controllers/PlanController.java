package ru.pavel.site.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.pavel.site.models.Construction;
import ru.pavel.site.repo.ConstructionRepository;
import ru.pavel.site.models.Construction;
import ru.pavel.site.repo.ConstructionRepository;

@Controller
public class PlanController {
    @Autowired
    private ConstructionRepository constructionRepository;

    @GetMapping("/plan")
    public String home (Model model) {
    Iterable<Construction> constructions = constructionRepository.findAll();
    model.addAttribute("constructions", constructions);
        return "plan";
    }
    @GetMapping("/planAdd")
    public String planAdd (Model model) {
        return "planAdd";
    }
    @GetMapping("/planTest")
    public String planTest (Model model) {
        return "planTest";
    }
    @PostMapping("/planAdd")
    public String planPostAdd (@RequestParam String location, @RequestParam String yes,
                               @RequestParam int square, Model model) {
        Construction construction = new Construction(location, yes, square);
        constructionRepository.save(construction);
        return "redirect:/planTest";
    }
}
