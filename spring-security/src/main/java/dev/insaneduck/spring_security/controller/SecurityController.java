package dev.insaneduck.spring_security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController
{
    @RequestMapping("/login")
    public String login()
    {
        return "login";
    }
}
