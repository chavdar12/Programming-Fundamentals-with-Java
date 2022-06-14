import java.util.Scanner;

public class Exercise_003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        int slashIndex = path.lastIndexOf('\\');
        int pointIndex = path.lastIndexOf('.');

        String name = path.substring(slashIndex + 1, pointIndex);
        String extension = path.substring(pointIndex + 1);

        System.out.printf("""
                                  File name: %s\r
                                  File extension: %s\r
                                  %n""", name, extension);
    }
}
