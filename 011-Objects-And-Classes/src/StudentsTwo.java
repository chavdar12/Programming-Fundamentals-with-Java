import Students.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String hometown = tokens[3];
            Student student = new Student(firstName, lastName, age, hometown);
            if (students.contains(student)) {
                int index = students.indexOf(student);
                students.set(index, student);
            } else {
                students.add(student);
            }
            input = scanner.nextLine();
        }
        String city = scanner.nextLine();
        for (Student student : students) {
            if (student.getHometown().equals(city)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}