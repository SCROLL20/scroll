package com.example.registrationlogin.controllers;

import com.example.registrationlogin.models.User;
import com.example.registrationlogin.models.LoginUser;
import com.example.registrationlogin.services.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("loginUser", new LoginUser());
        return "index.jsp";
    }

    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, HttpSession session) {
        if (!newUser.getPassword().equals(newUser.getPasswordConfirmation())) {
            result.rejectValue("passwordConfirmation", "Match", "Passwords must match");
        }
        if (result.hasErrors()) {
            return "index.jsp";
        }
        User registeredUser = userService.register(newUser);
        session.setAttribute("userId", registeredUser.getId());
        return "redirect:/success";
    }

    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("loginUser") LoginUser loginUser, BindingResult result, HttpSession session) {
        if (result.hasErrors()) {
            return "index.jsp";
        }
        try {
            User user = userService.login(loginUser);
            session.setAttribute("userId", user.getId());
            return "redirect:/success";
        } catch (Exception e) {
            result.rejectValue("email", "Invalid", "Invalid email or password");
            return "index.jsp";
        }
    }

    @GetMapping("/success")
    public String success(HttpSession session, Model model) {
        if (session.getAttribute("userId") == null) {
            return "redirect:/";
        }
        model.addAttribute("user", session.getAttribute("userId"));
        return "success.jsp";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}
