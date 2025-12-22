package com.skillnext;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n=== STUDENT MANAGEMENT SYSTEM ===");
            System.out.println("1. Insert Student Details");
            System.out.println("2. Update Student Details");
            System.out.println("3. Delete Student");
            System.out.println("4. Show All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1:
                        // Insert Student
                        System.out.print("Enter Name: ");
                        String name = sc.next();

                        System.out.print("Enter Semester: ");
                        int sem = sc.nextInt();

                        System.out.print("Enter Department: ");
                        String dept = sc.next();

                        Student s1 = new Student(name, sem, dept);
                        dao.addStudent(s1);
                        System.out.println("Student Added Successfully!");
                        break;

                    case 2:
                        // Update Student
                        System.out.print("Enter Student ID to Update: ");
                        int uid = sc.nextInt();

                        System.out.print("Enter New Name: ");
                        String uname = sc.next();

                        System.out.print("Enter New Semester: ");
                        int usem = sc.nextInt();

                        System.out.print("Enter New Department: ");
                        String udept = sc.next();

                        Student us = new Student(uname, usem, udept);
                        us.setId(uid);
                        dao.updateStudent(us);

                        System.out.println("Student Updated Successfully!");
                        break;

                    case 3:
                        // Delete Student
                        System.out.print("Enter Student ID to Delete: ");
                        int did = sc.nextInt();
                        dao.deleteStudent(did);
                        System.out.println("Student Deleted Successfully!");
                        break;

                    case 4:
                        // Show All Students
                        List<Student> list = dao.getAllStudents();
                        for (Student st : list) {
                            System.out.println(st);
                        }
                        break;

                    case 5:
                        System.out.println("Exiting Program...");
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice! Try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}