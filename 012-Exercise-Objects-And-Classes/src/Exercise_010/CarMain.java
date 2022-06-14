package Exercise_010;

import java.util.ArrayList;
import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Engine> engines;
        engines = getEngines(scanner, n);
        n = Integer.parseInt(scanner.nextLine());
        ArrayList<Car> cars = getCars(scanner, n, engines);

        for (Car car : cars) {
            System.out.println(car);
        }

    }

    private static ArrayList<Car> getCars(Scanner scanner, int n, ArrayList<Engine> engines) {
        ArrayList<Car> cars = new ArrayList<>();
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split(" ");

            String model = tokens[0];
            String engineModel = tokens[1];
            int weight;
            String color;
            Engine engine = null;

            for (Engine eng : engines) {
                if (eng.getModel().equals(engineModel)) {
                    engine = eng;
                }
            }

            Car car;
            if (tokens.length == 2) {
                car = new Car(model, engine);
            } else if (tokens.length == 3) {
                if (isNumeric(tokens[2])) {
                    weight = Integer.parseInt(tokens[2]);
                    car = new Car(model, engine, weight);
                } else {
                    color = tokens[2];
                    car = new Car(model, engine, color);
                }
            } else {
                car = new Car(model, engine, Integer.parseInt(tokens[2]), tokens[3]);
            }
            cars.add(car);
        }
        return cars;
    }

    private static ArrayList<Engine> getEngines(Scanner scanner, int n) {
        ArrayList<Engine> engines = new ArrayList<>();
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split(" ");
            Engine engine;

            if (tokens.length == 2) {
                engine = new Engine(tokens[0], Integer.parseInt(tokens[1]));
            } else if (tokens.length == 3) {
                engine = new Engine(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
            } else {
                engine = new Engine(tokens[0], Integer.parseInt(tokens[1]), tokens[2], tokens[3]);
            }
            engines.add(engine);
        }
        return engines;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int number = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
