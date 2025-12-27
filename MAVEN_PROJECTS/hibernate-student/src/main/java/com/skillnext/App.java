package com.skillnext;

public class App {
    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        Student s1 = new Student("Rahul", 5, "cse", 21);

        dao.saveStudent(s1);

        Student fetched = dao.getStudent(1);
        System.out.println("Fetched Student: " + fetched.getName());
    }
}
