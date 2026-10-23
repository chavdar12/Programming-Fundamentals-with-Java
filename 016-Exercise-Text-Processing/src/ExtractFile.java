import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] path = scanner.nextLine().split("\\\\");
        String file = path[path.length - 1];
        int dot = file.lastIndexOf('.');
        System.out.println("File name: " + file.substring(0, dot));
        System.out.println("File extension: " + file.substring(dot + 1));
    }
}
