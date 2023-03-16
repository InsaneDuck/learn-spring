package dev.insaneduck.hibernate_web_app.controller;

import dev.insaneduck.hibernate_web_app.dao.StudentDAO;
import dev.insaneduck.hibernate_web_app.model.Course;
import dev.insaneduck.hibernate_web_app.model.Instructor;
import dev.insaneduck.hibernate_web_app.model.Student;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
    @Autowired
    StudentDAO studentDAO;

    @PostMapping("/addStudent")
    public String addStudent(@Valid @ModelAttribute("student") Student student,
                             BindingResult bindingResult, Model model) {
        studentDAO.addStudent(student);
        model.addAttribute("course", new Course());
        model.addAttribute("instructor", new Instructor());
        return "index";
    }

    @RequestMapping("/updateStudent")
    public String updateStudent(@RequestParam("studentId") int id, Model model) {
        model.addAttribute("student", studentDAO.getStudent(id));
        model.addAttribute("course", new Course());
        model.addAttribute("instructor", new Instructor());
        return "index";
    }

    @RequestMapping("/enrollStudent")
    public String enrollStudent(@Valid @ModelAttribute("instructor") Instructor instructor,
                                BindingResult bindingResult, Model model) {

        return "index";
    }
}
