package com.skillnext;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int sem;
    private String dept;
    private int age;

    public Student() {}

    public Student(String name, int sem, String dept, int age) {
        this.name = name;
        this.sem = sem;
        this.dept = dept;
        this.age = age;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getSem() { return sem; }
    public String getDept() { return dept; }
    public int getAge() { return age; }
}
