package personal.ex.GradeManagement;

import java.util.HashMap;

public class Student {
    private String name;
    private int id;
    private HashMap<String, Integer> grades;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.grades = new HashMap<>();
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public void addGrade(String subject, int grade) {
        grades.put(subject, grade);
    }
    public void removeGrade(String subject) {
        grades.remove(subject);
    }
    public void updateGrade(String subject, int grade) {
        grades.put(subject, grade);
    }
    public double calculateAverageGrade() {
        if (grades.isEmpty()) return 0.0;

        int total = 0;
        for (int grade : grades.values()) {
            total += grade;
        }
        return (double) total / grades.size();
    }
}
