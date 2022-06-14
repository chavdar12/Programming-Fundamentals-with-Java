import clases.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise_006 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student> students = new ArrayList<>();

        while (!"end".equals(input)) {
            String[] studentInfo = input.split(" ");
            int age = Integer.parseInt(studentInfo[2]);

            Student student = findByFirstAndLastName(students, studentInfo[0], studentInfo[1]);
            if (student == null) {
                student = new Student(studentInfo[0], studentInfo[1], age, studentInfo[3]);
                students.add(student);
            } else {
                student.setAge(age);
                student.setHometown(studentInfo[3]);
            }

            input = scanner.nextLine();
        }

        String city = scanner.nextLine();

        for (Student student : students) {
            if (student.getHometown().equals(city)) {
                System.out.printf("%s %s is %d years old.%n", student.getFirstName(), student.getLastName(),
                                  student.getAge());
            }
        }
    }

    private static Student findByFirstAndLastName(List<Student> students, String firstName, String lastName) {

        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return student;
            }
        }
        return null;
    }
}