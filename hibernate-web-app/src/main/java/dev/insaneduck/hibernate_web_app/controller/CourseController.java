package dev.insaneduck.hibernate_web_app.controller;

import dev.insaneduck.hibernate_web_app.model.Course;
import dev.insaneduck.hibernate_web_app.model.Instructor;
import dev.insaneduck.hibernate_web_app.model.Student;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {


    @RequestMapping("/addCourse")
    public String addCourse(@Valid @ModelAttribute("course") Course course,
                            BindingResult bindingResult, Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("instructor", new Instructor());
        return "index";
    }


}
