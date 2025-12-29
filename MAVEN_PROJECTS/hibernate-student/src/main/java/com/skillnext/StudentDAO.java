package com.skillnext;

import org.hibernate.Session;
import java.util.List;

public class StudentDAO {

    public void insertStudent(Student s) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(s);
        session.getTransaction().commit();
        session.close();
    }

    public void updateStudent(int id, String name, String branch, int sem) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Student s = session.get(Student.class, id);
        if (s != null) {
            s.setName(name);
            s.setBranch(branch);
            s.setSem(sem);
        }

        session.getTransaction().commit();
        session.close();
    }

    public void deleteStudent(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Student s = session.get(Student.class, id);
        if (s != null) {
            session.delete(s);
        }

        session.getTransaction().commit();
        session.close();
    }

    public List<Student> getAllStudents() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Student> list =
                session.createQuery("from Student", Student.class).list();
        session.close();
        return list;
    }

    
    public List<Student> getStudentsOrderByName() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Student> list =
                session.createQuery(
                        "from Student s order by s.name",
                        Student.class
                ).list();
        session.close();
        return list;
    }
}
