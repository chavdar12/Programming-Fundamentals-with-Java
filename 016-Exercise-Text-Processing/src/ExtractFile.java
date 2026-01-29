import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] path = scanner.nextLine().split("\\\\");
        String[] file = path[path.length - 1].split("\\.");
        System.out.println("File name: " + file[0]);
        System.out.println("File extension: " + file[1]);
    }
}
