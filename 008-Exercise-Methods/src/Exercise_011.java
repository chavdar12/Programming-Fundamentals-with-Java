import java.util.Arrays;
import java.util.Scanner;

public class Exercise_011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();
        while (!"end".equals(input)) {

            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "exchange":
                    int positionToExchange = Integer.parseInt(command[1]);

                    if (positionToExchange >= 0 && positionToExchange < array.length) {

                        exchange(array, positionToExchange);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    String typeNum = command[1];
                    int index;

                    if ("odd".equals(typeNum)) {
                        index = maxEvenOrOddIndex(array, 1);
                    } else {
                        index = maxEvenOrOddIndex(array, 0);
                    }
                    System.out.println(index);

                    if (index == -1) {
                        System.out.println("No matches");
                    }
                    break;
                case "min":
                    typeNum = command[1];

                    if ("odd".equals(typeNum)) {
                        index = minEvenOrOddIndex(array, 1);

                    } else {
                        index = minEvenOrOddIndex(array, 0);

                    }
                    if (index == -1) {
                        System.out.println("No matches");
                    } else {
                        System.out.println(index);
                    }
                    break;
                case "first":
                    int count = Integer.parseInt(command[1]);

                    if (count > array.length) {
                        System.out.println("Invalid count");
                        break;
                    }
                    typeNum = command[2];
                    int[] result = new int[0];

                    if ("odd".equals(typeNum)) {
                        result = firstEvenOrOddElements(array, count, 1);
                    } else if ("even".equals(typeNum)) {
                        result = firstEvenOrOddElements(array, count, 0);
                    }

                    System.out.println(Arrays.toString(result));
                    break;
                case "last":
                    count = Integer.parseInt(command[1]);

                    if (count > array.length) {
                        System.out.println("Invalid count");
                        break;
                    }

                    typeNum = command[2];
                    result = new int[0];

                    if ("odd".equals(typeNum)) {
                        result = lastEvenOrOddElements(array, count, 1);
                    } else if ("even".equals(typeNum)) {
                        result = lastEvenOrOddElements(array, count, 0);
                    }

                    System.out.println(Arrays.toString(result));
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println(Arrays.toString(array));
    }

    public static int[] firstEvenOrOddElements(int[] arr, int neededCount, int divisibleResult) {
        int[] resultArr = new int[neededCount];
        int currCounter = 0;

        for (int j : arr) {
            if (j % 2 == divisibleResult && currCounter < neededCount) {
                resultArr[currCounter] = j;
                currCounter++;
            }
        }
        if (currCounter == 0) {
            return new int[0];
        } else if (currCounter <= neededCount - 1) {
            return Arrays.copyOf(resultArr, currCounter);
        }
        return resultArr;
    }

    private static int[] lastEvenOrOddElements(int[] arr, int neededCount, int divisibleResult) {
        int[] resultArr = new int[neededCount];
        int currCounter = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == divisibleResult && currCounter < neededCount) {
                resultArr[currCounter] = arr[i];
                currCounter++;
            }
        }

        if (currCounter == 0) {
            return new int[0];
        } else if (currCounter <= neededCount - 1) {
            return Arrays.copyOf(resultArr, currCounter);
        }
        return reverse(resultArr);

    }

    static int[] reverse(int[] arr) {
        int i, temp;
        for (i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }

    public static void exchange(int[] arr, int position) {
        for (int i = 0; i <= position; i++) {
            int firstNum = arr[0];

            System.arraycopy(arr, 1, arr, 0, arr.length - 1);

            arr[arr.length - 1] = firstNum;
        }

    }

    public static int maxEvenOrOddIndex(int[] arr, int divisonResult) {
        int maxNum = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= maxNum && arr[i] % 2 == divisonResult) {
                maxNum = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static int minEvenOrOddIndex(int[] arr, int divisionResult) {
        int minNum = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= minNum && arr[i] % 2 == divisionResult) {
                minNum = arr[i];
                index = i;
            }
        }
        return index;
    }
}