package kz.zhelezyaka.tamingthymeleaf.application;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class RootController {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("pageTitle", "Taming Thymeleaf page");
        model.addAttribute("scientists", List.of(
                "Albert Einstin",
                "Niels Bohr",
                "James Clerk Maxwell"));
        model.addAttribute("searchTerm", "springframework.guru");
        return "index";
    }
}
