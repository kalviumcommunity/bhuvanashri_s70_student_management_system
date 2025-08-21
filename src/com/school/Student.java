package com.school;

public class Student {
    private int id;
    private String name;
    private int age;

    // Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getter Methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Display Student Details
    public void display() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}
