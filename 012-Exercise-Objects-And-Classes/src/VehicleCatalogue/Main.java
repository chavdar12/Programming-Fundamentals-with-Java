package VehicleCatalogue;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");

            String type = tokens[0];
            String model = tokens[1];
            String color = tokens[2];
            int horsepower = Integer.parseInt(tokens[3]);
            Vehicle vehicle;
            if ("car".equals(type)) {
                vehicle = new Vehicle("Car", model, color, horsepower);
            } else {
                vehicle = new Vehicle("Truck", model, color, horsepower);
            }
            vehicles.add(vehicle);
            input = scanner.nextLine();
        }

        String model = scanner.nextLine();
        while (!"Close the Catalogue".equals(model)) {
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getModel().equals(model)) {
                    System.out.println(vehicle);
                }
            }
            model = scanner.nextLine();
        }
        double carsHP = printHorsepower(vehicles, "Car");
        double trucksHP = printHorsepower(vehicles, "Truck");

        System.out.printf("Cars have average horsepower of: %.2f.%n", carsHP);
        System.out.printf("Trucks have average horsepower of: %.2f.", trucksHP);
    }

    public static double printHorsepower(ArrayList<Vehicle> vehicles, String type) {
        double sum = 0.0;
        int counter = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equals(type)) {
                sum += vehicle.getHorsepower();
                counter++;
            }
        }
        if (counter == 0) {
            return 0;
        } else {
            return sum / counter;
        }
    }
}
