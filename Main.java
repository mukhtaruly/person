import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("U", 18, true);
        person1.setName("jonh");
        person1.setAge(20);
        person1.setGender(true);
        person1.printPerson();

        Person person2 = new Person("U", 18, true);
        person2.name = "Nurassyl";
        person2.age = 18;
        person2.gender = true;
    }
}
class Person {
    String name;
    int age;
    boolean gender;
    public Person(String name, int age, boolean gender) {
        this.name = "U";
        this.age = 0;
        this.gender = false;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public String getName(String name) {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean getGender() {
        return gender;
    }


    public void printPerson() {
        System.out.println(name + " " + age + " " + gender);
    }
    
}