
public class Student {
    private static int id = 1;
    private int id_gen;
    private String name;
    private String surname;
    private int age;
    private double GPA;

    public Student() { //no arg constructor
        id_gen = id++;
    }

    public Student(String name, String surname, int age, double GPA) {
        this(); //calling no ar constructor
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.GPA = GPA;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getGPA() {
        return GPA;
    }

    public String toString() {
        return "Student id: " + id_gen +
                "\nFull name: " + name + " " + surname +
                "\nAge: " + age +
                "\nGPA: " + GPA;
    }
}
