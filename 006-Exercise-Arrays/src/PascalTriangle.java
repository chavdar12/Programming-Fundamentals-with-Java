import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int triangleRows = Integer.parseInt(scanner.nextLine());

        int[][] jaggedArray = new int[triangleRows][];

        jaggedArray[0] = new int[1];
        jaggedArray[0][0] = 1;

        for (int row = 1; row < jaggedArray.length; row++) {
            jaggedArray[row] = new int[row + 1];
            jaggedArray[row][0] = 1;
            jaggedArray[row][jaggedArray[row].length - 1] = 1;

            for (int col = 1; col < jaggedArray[row].length - 1; col++) {
                int leftDiagonal = jaggedArray[row - 1][col - 1];
                int rightDiagonal = jaggedArray[row - 1][col];

                jaggedArray[row][col] = leftDiagonal + rightDiagonal;
            }
        }

        for (int[] ints : jaggedArray) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}