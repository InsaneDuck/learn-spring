package dev.insaneduck.hibernate_web_app.controller;

import dev.insaneduck.hibernate_web_app.dao.StudentDAO;
import dev.insaneduck.hibernate_web_app.model.Course;
import dev.insaneduck.hibernate_web_app.model.Instructor;
import dev.insaneduck.hibernate_web_app.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    StudentDAO studentDAO;

    @InitBinder
    public void sanitiseInputs(WebDataBinder webDataBinder) {
        webDataBinder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
        webDataBinder.setDisallowedFields("*");
    }

    @RequestMapping("/")
    public String showHome(Model model) {

        model.addAttribute("student", new Student());
        model.addAttribute("course", new Course());
        model.addAttribute("instructor", new Instructor());
        List<Student> students = studentDAO.getAllStudents();
        System.out.println(students);
        model.addAttribute("students", students);
        return "index";
    }
}
