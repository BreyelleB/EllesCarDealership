package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private Scanner scanner;

    public UserInterface() {
         scanner = new Scanner (System.in);
    }

    public void display() {
        init();

        boolean running = true;
        while (running) {
            displayMenu ();
            System.out.println("Enter your selection");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    break;
                case 7:
                    processAllVehiclesRequest();
                    break;
                case 99:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        System.out.println("Goodbye!");

    }

    private void init() {
        DealershipFileManager fileManager = new DealershipFileManager();
        dealership = fileManager.getDealership();

    }

    private void displayMenu() {
        System.out.println("\n--- Dealership Menu---");
        System.out.println("1 - Search a vehicle within your price range ");
        System.out.println("2 - Find vehicles by make/model");
        System.out.println("3 - Find vehicles by year range");
        System.out.println("4 - Find vehicles by color");
        System.out.println("5 - Find vehicles by mileage range");
        System.out.println("6 - Find vehicles by the type (car, truck, SUV, van");
        System.out.println("7 - List ALL vehicles");
        System.out.println("8 - Add a vehicle");
        System.out.println("9 - Remove a vehicle");
        System.out.println("99 - Quit");

    }
    private void displayVehicles(List<Vehicle> vehicles) {
        if (vehicles == null || vehicles.isEmpty()) {
            System.out.println("No vehicles found.");
            return;

        }

        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle.getVin() + " | " +
                              vehicle.getYear() + " | " +
                              vehicle.getMake() + " | " +
                              vehicle.getModel() + " | " +
                              vehicle.getVehicleType() + " | " +
                              vehicle.getColor() + " | " +
                              vehicle.getOdometer() + " | " +
                              vehicle.getPrice() + " | " +
                              vehicle.getPrice());

        }
    }

    private void processAllVehiclesRequest() {
        List<Vehicle> vehicles = dealership.getAllVehicles();
        displayVehicles(vehicles);
    }

}
