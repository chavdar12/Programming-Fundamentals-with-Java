package CompanyRoster;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        Map<String, List<Employee>> departments = new HashMap<>();

        while (lines-- > 0) {

            String input = scanner.nextLine();

            List<String> data = Arrays.stream(input.split(" ")).toList();

            String name = data.get(0);
            double salary = Double.parseDouble(data.get(1));
            String position = data.get(2);
            String department = data.get(3);

            Employee employee = new Employee(name, salary, position, department);

            if (data.size() == 5) {
                if (input.contains("@")) {
                    employee.setEmail(data.get(4));
                } else {
                    employee.setAge(Integer.parseInt(data.get(4)));
                }
            } else if (data.size() == 6) {
                employee.setEmail(data.get(4));
                employee.setAge(Integer.parseInt(data.get(5)));

            }
            if (!departments.containsKey(department)) {
                departments.put(department, new ArrayList<>());
            }
            departments.get(department).add(employee);
        }

        departments.entrySet().stream().sorted((a, b) -> {
            double avrFirst = a.getValue().stream().mapToDouble(Employee::getSalary).average().orElse(Double.NaN);
            double avrSecond = b.getValue().stream().mapToDouble(Employee::getSalary).average().orElse(Double.NaN);
            return Double.compare(avrSecond, avrFirst);

        }).limit(1).forEach(e -> {
            System.out.printf("Highest Average Salary: %s%n", e.getKey());
            e.getValue().stream().sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary())).forEach(o -> System.out
                    .printf("%s %.2f %s %d%n", o.getName(), o.getSalary(), o.getEmail(), o.getAge()));
        });
    }
}
