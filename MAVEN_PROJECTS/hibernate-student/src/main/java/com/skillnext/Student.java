package com.skillnext;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String branch;
    private int sem;

    public Student() {}

    public Student(String name, String branch, int sem) {
        this.name = name;
        this.branch = branch;
        this.sem = sem;
    }

    // getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getBranch() { return branch; }
    public int getSem() { return sem; }

    // setters (needed for update)
    public void setName(String name) { this.name = name; }
    public void setBranch(String branch) { this.branch = branch; }
    public void setSem(int sem) { this.sem = sem; }
}
