package RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Car> cars = new ArrayList<>();
        while (n-- > 0) {
            String[] carInfo = scanner.nextLine().split("\\s+");
            String model = carInfo[0];
            int engineSpeed = Integer.parseInt(carInfo[1]);
            int enginePower = Integer.parseInt(carInfo[2]);
            int cargoWeight = Integer.parseInt(carInfo[3]);
            String cargoType = carInfo[4];
            List<Tire> tires = new ArrayList<>();
            for (int i = 0; i < 8; i += 2) {
                Tire tire = new Tire(Double.parseDouble(carInfo[5 + i]), Integer.parseInt(carInfo[6 + i]));
                tires.add(tire);
            }

            Car car = new Car(model, engineSpeed, enginePower, cargoWeight, cargoType, tires);
            cars.add(car);
        }
        String cargoType = scanner.nextLine();
        for (Car car : cars) {
            if ("fragile".equals(cargoType) && car.getCargoType().equals(cargoType)) {
                if (checkTirePressure(car)) {
                    System.out.println(car.getModel());
                }
            } else if ("flamable".equals(car.getCargoType())) {
                if (car.getEnginePower() > 250) {
                    System.out.println(car.getModel());
                }
            }
        }
    }

    private static boolean checkTirePressure(Car car) {
        List<Tire> tires = car.getTires();
        for (Tire tire : tires) {
            if (tire.getPressure() < 1) {
                return true;
            }
        }
        return false;
    }
}
