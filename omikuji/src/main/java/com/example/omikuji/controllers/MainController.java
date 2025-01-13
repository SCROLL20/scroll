package com.example.omikuji.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "redirect:/omikuji";
    }

    @GetMapping("/omikuji")
    public String omikuji() {
        return "index"; // Corresponds to index.jsp
    }

    @GetMapping("/omikuji/show")
    public String show(HttpSession session, Model model) {
        String result = (String) session.getAttribute("result");
        model.addAttribute("result", result);
        return "show"; // Corresponds to show.jsp
    }
}
