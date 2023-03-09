package dev.insaneduck.hibernate_web_app.dao.daoImpl_mariadb;

import dev.insaneduck.hibernate_web_app.dao.CourseDAO;
import dev.insaneduck.hibernate_web_app.model.Course;
import dev.insaneduck.hibernate_web_app.model.Student;

import java.util.List;

public class CourseDAOImpl implements CourseDAO {
    @Override
    public List<Course> getAllCourses() {
        return null;
    }

    @Override
    public List<Course> getCoursesByStudent(Student student) {
        return null;
    }

    @Override
    public void addCourse(Course course) {

    }
}
