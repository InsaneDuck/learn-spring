package dev.insaneduck.hibernate_web_app.dao;

import dev.insaneduck.hibernate_web_app.model.Student;

import java.util.List;

public interface StudentDAO {
    List<Student> getAllStudents();

    List<Student> getStudentsByCourse();

    void addStudent(Student student);

    Student getStudent(int id);

    void updateStudent(Student student);

    void deleteStudent(Student student);

    void enrollStudent(Student student);
}
