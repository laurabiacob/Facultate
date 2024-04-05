package personal.ex.GradeManagement;

import java.util.ArrayList;
import java.util.List;

public class GradeManagementSystem {
    private List<Student> students;

    public GradeManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void updateStudent(Student oldStudent, Student newStudent) {
        int index = students.indexOf(oldStudent);
        if (index != -1) {
            students.set(index, newStudent);
        }
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", ID: " + student.getId());
        }
    }

    public static void main(String[] args) {
        GradeManagementSystem system = new GradeManagementSystem();

        // Adding some sample students
        Student student1 = new Student("Alice", 101);
        student1.addGrade("Math", 90);
        student1.addGrade("Science", 85);
        system.addStudent(student1);

        Student student2 = new Student("Bob", 102);
        student2.addGrade("Math", 80);
        student2.addGrade("Science", 75);
        system.addStudent(student2);

        // Displaying students
        System.out.println("List of Students:");
        system.displayStudents();

        // Testing remove operation
        system.removeStudent(student2);
        System.out.println("\nAfter removing Bob:");
        system.displayStudents();

        // Testing update operation
        Student newStudent = new Student("Carol", 103);
        newStudent.addGrade("Math", 95);
        newStudent.addGrade("Science", 88);
        system.updateStudent(student1, newStudent);
        System.out.println("\nAfter updating Alice:");
        system.displayStudents();

        // Testing average grade calculation
        System.out.println("\nAverage grade of Alice: " + student1.calculateAverageGrade());
    }
}
