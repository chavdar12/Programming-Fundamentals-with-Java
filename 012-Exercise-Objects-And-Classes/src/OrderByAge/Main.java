package OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();
        String line = scanner.nextLine();
        while (!"End".equals(line)) {
            String[] tokens = line.split("\\s+");
            String name = tokens[0];
            int id = Integer.parseInt(tokens[1]);

            int age = Integer.parseInt(tokens[2]);
            Person person = new Person(name, id, age);
            people.add(person);
            line = scanner.nextLine();
        }

        people.stream().sorted(Comparator.comparingDouble(Person::getAge))
                .forEach(System.out::println);
    }
}
