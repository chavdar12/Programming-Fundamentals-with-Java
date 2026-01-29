import java.util.Scanner;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")) {
            switch (command[0]) {
                case "Contains" -> {
                    if (contains(input, command[1])) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                }
                case "Print" -> {
                    if (command[1].equals("even")) {
                        printEven(input);
                    } else {
                        printOdd(input);
                    }
                }
                case "Get" -> System.out.println(getSum(input));
                case "Filter" -> filter(input, command[1], command[2]);
            }
            command = scanner.nextLine().split(" ");
        }
    }

    private static void filter(String[] input, String s, String s1) {
        int number = Integer.parseInt(s1);
        switch (s) {
            case ">" -> {
                for (String s2 : input) {
                    if (Integer.parseInt(s2) > number) {
                        System.out.print(s2 + " ");
                    }
                }
            }
            case ">=" -> {
                for (String s2 : input) {
                    if (Integer.parseInt(s2) >= number) {
                        System.out.print(s2 + " ");
                    }
                }
            }
            case "<" -> {
                for (String s2 : input) {
                    if (Integer.parseInt(s2) < number) {
                        System.out.print(s2 + " ");
                    }
                }
            }
            case "<=" -> {
                for (String s2 : input) {
                    if (Integer.parseInt(s2) <= number) {
                        System.out.print(s2 + " ");
                    }
                }
            }
        }
        System.out.println();
    }

    private static int getSum(String[] input) {
        int sum = 0;
        for (String s : input) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }

    private static void printOdd(String[] input) {
        for (String s : input) {
            if (Integer.parseInt(s) % 2 != 0) {
                System.out.print(s + " ");
            }
        }
        System.out.println();
    }

    private static void printEven(String[] input) {
        for (String s : input) {
            if (Integer.parseInt(s) % 2 == 0) {
                System.out.print(s + " ");
            }
        }
        System.out.println();
    }

    private static boolean contains(String[] input, String s) {
        for (String s1 : input) {
            if (s1.equals(s)) {
                return true;
            }
        }
        return false;
    }
}