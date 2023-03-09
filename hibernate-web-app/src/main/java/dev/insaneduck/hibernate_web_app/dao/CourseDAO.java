package dev.insaneduck.hibernate_web_app.dao;

import dev.insaneduck.hibernate_web_app.model.Course;
import dev.insaneduck.hibernate_web_app.model.Student;

import java.util.List;

public interface CourseDAO {
    List<Course> getAllCourses();

    List<Course> getCoursesByStudent(Student student);

    void addCourse(Course course);
}
