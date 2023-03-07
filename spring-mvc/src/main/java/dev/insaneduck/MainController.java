package dev.insaneduck;

import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @InitBinder
    public void sanitiseInputs(WebDataBinder webDataBinder) {
        webDataBinder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }

    @RequestMapping("/")
    public String showHome(Model model) {
        model.addAttribute("student", new dev.insaneduck.Student());
        return "index";
    }

    @RequestMapping("/show")
    public String form(@RequestParam("string") String message, Model model) {
        model.addAttribute("student", new dev.insaneduck.Student());
        model.addAttribute("message", message.toUpperCase());
        return "index";
    }

    @RequestMapping("/setStudent")
    public String setStudent(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {
        System.out.println(bindingResult + "\n\n\n");
        return "index";
    }
}
