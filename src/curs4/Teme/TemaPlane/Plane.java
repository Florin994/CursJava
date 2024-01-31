package curs4.Teme.TemaPlane;

public class Plane {
    private String brand;
    private String model;
    private boolean isFlaying;
    private int maxPassengers;
    private int currentPassengers;

    public Plane(String brand, String model, int maxPassengers) {
        this.brand = brand;
        this.model = model;
        this.maxPassengers = maxPassengers;
        this.isFlaying = false;
        this.currentPassengers = 0;
    }

    public void addPassengers(int passengersAdded) {
        currentPassengers += passengersAdded;
        if (passengersAdded <= 0) {
            System.out.println("Number of added passengers cannot be negative or zero!");
        }
        if (currentPassengers > maxPassengers) {
            int passengersRemainInAirport = (currentPassengers - maxPassengers);
            currentPassengers = maxPassengers;
            System.out.println("The plane is full! " + passengersRemainInAirport
                    + " passengers remain in Airport for the next plane.");
        }
    }

    public void fly() {
        if (currentPassengers >= maxPassengers / 2 && !isFlaying) {
            System.out.println("The plane: " + brand + ", model: " + model
                    + " (with " + currentPassengers + " passengers) took off!!");
            isFlaying = true;
        } else if (currentPassengers < maxPassengers / 2) {
            System.out.println("We only have " + currentPassengers + " passengers, we need "
                    + ((maxPassengers / 2) - currentPassengers) + " more passengers to take off!");
        } else {
            System.out.println("The plane is already in the air!");
        }
    }

    public void land() {
        if (isFlaying) {
            System.out.println("The plan: " + brand + ", model: " + model
                    + " (with " + currentPassengers + " passengers) landed!");
            isFlaying = false;
        } else {
            System.out.println("The plane is already on the ground!");
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isFlaying() {
        return isFlaying;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public int getCurrentPassengers() {
        return currentPassengers;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public String toString() {
        return "Plane brand: " + brand + ", model: " + model + " (max " + maxPassengers + " seats available);";
    }
}
