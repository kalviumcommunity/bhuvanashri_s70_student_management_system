package com.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the School Management System!\n");

        // Create Student array
        Student[] students = {
            new Student(1, "Alice", 20),
            new Student(2, "Bob", 22),
            new Student(3, "Charlie", 21)
        };

        // Create Course array
        Course[] courses = {
            new Course("C101", "Mathematics", 4),
            new Course("C102", "Computer Science", 3),
            new Course("C103", "English Literature", 2)
        };

        // Display all Students
        System.out.println("=== Student Details ===");
        for (Student s : students) {
            s.display();
        }

        // Display all Courses
        System.out.println("\n=== Course Details ===");
        for (Course c : courses) {
            c.display();
        }
    }
}
