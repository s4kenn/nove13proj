package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class homecontroller {

    @RequestMapping("/welcome")
    public String homepage(Model model) {
        String username = "Aditya";
        model.addAttribute("name", username);
        return "home";
    }

}
