package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private List<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();

    }

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);

    }

    public void removeVehicle(int vin) {
        Vehicle toRemove = null;
        for (Vehicle vehicle: inventory) {
            if (vehicle.getVin() == vin) {
                toRemove = vehicle;
                break;
            }
        }
        if (toRemove != null) {
            inventory.remove(toRemove);
        }
    }

    public List<Vehicle> getAllVehicles() {
        return inventory;

        public List<Vehicle> getVehiclesByPrice(double min, d2ouble max) {
            List<Vehicle> results = new ArrayList<>();

        }

    }

    public List<Vehicle> getVehiclesByPrice (double min, double max) {
        return null;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model){
        return null;
    }

    public List<Vehicle> getVehiclesByYear(int min, int max){
        return null;

    }

    public List<Vehicle> getVehiclesByColor(String color) {
        return null;
    }

    public List<Vehicle> getVehiclesByMileage(int min, int max) {
        return null;
    }

    public List<Vehicle> getVehiclesByType(String type) {
        return null;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Vehicle> getInventory() {
        return inventory;
    }

    public void setInventory(List<Vehicle> inventory) {
        this.inventory = inventory;
    }
}
