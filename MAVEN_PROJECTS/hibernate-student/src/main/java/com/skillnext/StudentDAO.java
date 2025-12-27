package com.skillnext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class StudentDAO {

    private SessionFactory factory;

    public StudentDAO() {
        this.factory = HibernateUtil.getSessionFactory();
    }

    public void saveStudent(Student student) {
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
    }

    public Student getStudent(int id) {
        Session session = factory.openSession();
        Student student = session.get(Student.class, id);
        session.close();
        return student;
    }
}
