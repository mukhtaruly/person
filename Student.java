import java.util.ArrayList;
import java.util.List;

class Student extends Person {
    private int studentID;
    private List<Integer> grades;

    public Student(String name, String surname, int age, boolean gender, int studentID) {
        super(name, surname, age, gender);
        this.studentID = studentID;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateGPA() {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return grades.size() > 0 ? (double) total / grades.size() : 0;
    }

    @Override
    public String toString() {
        String gradesString = grades.isEmpty() ? "No grades" : grades.toString();
        return super.toString() + " I am a student with ID " + studentID + ". My grades: " + gradesString + ".";
    }
}

class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;
    private int salary;

    public Teacher(String name, String surname, int age, boolean gender, String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public void giveRaise(double percentage) {
        if (yearsOfExperience > 10) {
            salary += salary * percentage / 100;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " I teach " + subject + ". My salary: " + salary + " and I have " + yearsOfExperience + " years of experience.";
    }
}
