package com.skillnext;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT =====");
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.println("6. Display Order By Name");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("How many students to insert? ");
                    int n = sc.nextInt();

                    for (int i = 1; i <= n; i++) {
                        sc.nextLine();

                        System.out.println("\nStudent " + i);

                        System.out.print("Enter name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter branch: ");
                        String branch = sc.nextLine();

                        System.out.print("Enter semester: ");
                        int sem = sc.nextInt();

                        dao.insertStudent(new Student(name, branch, sem));
                    }
                    System.out.println("Inserted successfully.");
                    break;

                case 2:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    String uname = sc.nextLine();

                    System.out.print("Enter new branch: ");
                    String ubranch = sc.nextLine();

                    System.out.print("Enter new semester: ");
                    int usem = sc.nextInt();

                    dao.updateStudent(uid, uname, ubranch, usem);
                    System.out.println("Updated successfully.");
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();
                    dao.deleteStudent(did);
                    System.out.println("Deleted successfully.");
                    break;

                case 4:
                    List<Student> list = dao.getAllStudents();
                    System.out.println("\nID  Name  Branch  Sem");
                    for (Student s : list) {
                        System.out.println(
                                s.getId() + "  " +
                                s.getName() + "  " +
                                s.getBranch() + "  " +
                                s.getSem()
                        );
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);

                case 6:
                    List<Student> sortedList = dao.getStudentsOrderByName();
                    System.out.println("\nID  Name  Branch  Sem (ORDER BY NAME)");
                    for (Student s : sortedList) {
                        System.out.println(
                                s.getId() + "  " +
                                s.getName() + "  " +
                                s.getBranch() + "  " +
                                s.getSem()
                        );
                    }
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
