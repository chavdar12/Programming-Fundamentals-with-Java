import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] tokens = command.split(" ");
            switch (tokens[0]) {
                case "exchange" -> {
                    int index = Integer.parseInt(tokens[1]);
                    if (index < 0 || index >= numbers.length) {
                        System.out.println("Invalid index");
                    } else {
                        exchange(numbers, index);
                    }
                }
                case "max" -> {
                    if (tokens[1].equals("even")) {
                        int maxEvenIndex = getMaxEvenIndex(numbers);
                        if (maxEvenIndex == -1) {
                            System.out.println("No matches");
                        } else {
                            System.out.println(maxEvenIndex);
                        }
                    } else {
                        int maxOddIndex = getMaxOddIndex(numbers);
                        if (maxOddIndex == -1) {
                            System.out.println("No matches");
                        } else {
                            System.out.println(maxOddIndex);
                        }
                    }
                }
                case "min" -> {
                    if (tokens[1].equals("even")) {
                        int minEvenIndex = getMinEvenIndex(numbers);
                        if (minEvenIndex == -1) {
                            System.out.println("No matches");
                        } else {
                            System.out.println(minEvenIndex);
                        }
                    } else {
                        int minOddIndex = getMinOddIndex(numbers);
                        if (minOddIndex == -1) {
                            System.out.println("No matches");
                        } else {
                            System.out.println(minOddIndex);
                        }
                    }
                }
                case "first" -> {
                    int count = Integer.parseInt(tokens[1]);
                    if (count < 0 || count > numbers.length) {
                        System.out.println("Invalid count");
                    } else {
                        if (tokens[2].equals("even")) {
                            int[] firstEven = getFirstEven(numbers, count);
                            printArray(firstEven);
                        } else {
                            int[] firstOdd = getFirstOdd(numbers, count);
                            printArray(firstOdd);
                        }
                    }
                }
                case "last" -> {
                    int count1 = Integer.parseInt(tokens[1]);
                    if (count1 < 0 || count1 > numbers.length) {
                        System.out.println("Invalid count");
                    } else {
                        if (tokens[2].equals("even")) {
                            int[] lastEven = getLastEven(numbers, count1);
                            printArray(lastEven);
                        } else {
                            int[] lastOdd = getLastOdd(numbers, count1);
                            printArray(lastOdd);
                        }
                    }
                }
            }
            command = scanner.nextLine();
        }
        printArray(numbers);
    }

    private static int getMaxOddIndex(int[] numbers) {
        int maxOdd = Integer.MIN_VALUE;
        int maxOddIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0 && numbers[i] >= maxOdd) {
                maxOdd = numbers[i];
                maxOddIndex = i;
            }
        }
        return maxOddIndex;
    }

    private static int getMaxEvenIndex(int[] numbers) {
        int maxEven = Integer.MIN_VALUE;
        int maxEvenIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] >= maxEven) {
                maxEven = numbers[i];
                maxEvenIndex = i;
            }
        }
        return maxEvenIndex;
    }

    private static int[] getLastOdd(int[] numbers, int count1) {
        int[] lastOdd = new int[count1];
        int index = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 2 != 0) {
                lastOdd[index] = numbers[i];
                index++;
                if (index == count1) {
                    break;
                }
            }
        }
        int[] result = new int[index];
        System.arraycopy(lastOdd, 0, result, 0, index);
        return result;
    }

    private static int[] getFirstOdd(int[] numbers, int count) {
        int[] result = new int[count];
        int index = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                result[index] = number;
                index++;
                if (index == count) {
                    break;
                }
            }
        }
        return result;
    }

    private static void printArray(int[] firstEven) {
        if (firstEven.length == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            for (int i = 0; i < firstEven.length; i++) {
                if (i == firstEven.length - 1) {
                    System.out.print(firstEven[i]);
                } else {
                    System.out.print(firstEven[i] + ", ");
                }
            }
            System.out.println("]");
        }
    }

    private static int[] getFirstEven(int[] numbers, int count) {
        int[] result = new int[count];
        int index = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                result[index] = number;
                index++;
                if (index == count) {
                    break;
                }
            }
        }
        return result;
    }

    private static int[] getLastEven(int[] numbers, int count1) {
        int[] lastEven = new int[count1];
        int index = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 2 == 0) {
                lastEven[index] = numbers[i];
                index++;
                if (index == count1) {
                    break;
                }
            }
        }
        int[] result = new int[index];
        System.arraycopy(lastEven, 0, result, 0, index);
        return result;
    }

    private static int getMinOddIndex(int[] numbers) {
        int minOddIndex = -1;
        int minOdd = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0 && numbers[i] <= minOdd) {
                minOdd = numbers[i];
                minOddIndex = i;
            }
        }
        return minOddIndex;
    }

    private static int getMinEvenIndex(int[] numbers) {
        int minEvenIndex = -1;
        int minEven = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] <= minEven) {
                minEven = numbers[i];
                minEvenIndex = i;
            }
        }
        return minEvenIndex;
    }

    private static void exchange(int[] numbers, int index) {
        int[] temp = new int[numbers.length];
        int tempIndex = 0;
        for (int i = index + 1; i < numbers.length; i++) {
            temp[tempIndex] = numbers[i];
            tempIndex++;
        }
        for (int i = 0; i <= index; i++) {
            temp[tempIndex] = numbers[i];
            tempIndex++;
        }
        System.arraycopy(temp, 0, numbers, 0, numbers.length);
    }
}