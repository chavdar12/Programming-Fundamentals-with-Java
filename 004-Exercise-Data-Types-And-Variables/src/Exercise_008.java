import java.util.Scanner;

public class Exercise_008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double maxVolume = -1.0;
        String maxKeg = "";
        for (int i = 0; i < n; i++) {
            String kegModel = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;
            if (volume > maxVolume) {
                maxVolume = volume;
                maxKeg = kegModel;
            }
        }
        System.out.println(maxKeg);
    }
}
