package dev.insaneduck.hibernate_web_app.dao.daoImpl_mariadb;

import dev.insaneduck.hibernate_web_app.dao.StudentDAO;
import dev.insaneduck.hibernate_web_app.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public StudentDAOImpl() {

    }

    @Override
    @Transactional
    public List<Student> getAllStudents() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Student", Student.class).getResultList();
    }

    @Override
    public List<Student> getStudentsByCourse() {
        return null;
    }

    @Override
    @Transactional
    public void addStudent(Student student) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(student);
        session.flush();
    }

    @Override
    @Transactional
    public Student getStudent(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Student.class, id);
    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void deleteStudent(Student student) {

    }

    @Override
    public void enrollStudent(Student student) {

    }
}
