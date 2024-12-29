import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        School school = new School();

        try {
            BufferedReader studentReader = new BufferedReader(new FileReader("src/students-2.txt"));
            String line;
            while ((line = studentReader.readLine()) != null) {

                String[] parts = line.split("\\s+");

                String name = parts[0];
                String surname = parts[1];
                int age = Integer.parseInt(parts[2]);
                boolean gender = parts[3].equalsIgnoreCase("Male");
                int studentID = (int) (Math.random() * 9000) + 1000; // Студентке ID беру


                Student student = new Student(name, surname, age, gender, studentID);


                for (int i = 4; i < parts.length; i++) {
                    student.addGrade(Integer.parseInt(parts[i]));
                }
                school.addMember(student);
            }
            studentReader.close();
        } catch (IOException e) {
            System.out.println("Error reading students file.");
        } catch (NumberFormatException e) {
            System.out.println("Error parsing number from students file.");
        }

        try {
            BufferedReader teacherReader = new BufferedReader(new FileReader("src/teachers.txt"));
            String line;
            while ((line = teacherReader.readLine()) != null) {
                // Жолды бос орындар арқылы бөлшектеу
                String[] parts = line.split("\\s+");

                // Деректерді алу
                String name = parts[0];
                String surname = parts[1];
                int age = Integer.parseInt(parts[2]);
                boolean gender = parts[3].equalsIgnoreCase("Male");
                String subject = parts[4];
                int yearsOfExperience = Integer.parseInt(parts[5]);
                int salary = Integer.parseInt(parts[6]);


                Teacher teacher = new Teacher(name, surname, age, gender, subject, yearsOfExperience, salary);

                school.addMember(teacher);
            }
            teacherReader.close();
        } catch (IOException e) {
            System.out.println("Error reading teachers file.");
        } catch (NumberFormatException e) {
            System.out.println("Error parsing number from teachers file.");
        }

        // Print all members
        System.out.println("School Members:");
        school.printMembers();
    }
}





