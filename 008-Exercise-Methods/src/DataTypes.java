import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String type = scanner.nextLine();
        String output = switch (type) {
            case "int" -> String.valueOf(Integer.parseInt(input) * 2);
            case "real" -> String.format("%.2f", Double.parseDouble(input) * 1.5);
            case "string" -> "$" + input + "$";
            default -> "";
        };
        System.out.println(output);
    }
}
