package curs4.Teme.TemaBus;

public class Bus {
    private String brand;
    private int maxPassengers;
    private int maxSpeed;
    private int numberOfPassengers;
    private int currentSpeed;

    public Bus(String brand, int maxPassengers, int maxSpeed) {
        this.brand = brand;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.numberOfPassengers = 0;
        this.currentSpeed = 0;
    }

    public void addPassengers(int numberOfPassengersAdded) {
        if (numberOfPassengersAdded < 0) {
            System.out.println("We cannot add a negative number of passengers!");
            numberOfPassengersAdded = 0;
        }
        numberOfPassengers += numberOfPassengersAdded;
        if (numberOfPassengers > maxPassengers) {
            int passengersUnbounded = numberOfPassengers - maxPassengers;
            numberOfPassengers = maxPassengers;
            System.out.println("The buss is full! Passengers remaining in the station: " + passengersUnbounded);
        }
    }

    public void removePassengers(int numberOfPassengersRemoved) {
        if (numberOfPassengersRemoved < 0) {
            System.out.println("We cannot remove a negative number of passengers!");
            numberOfPassengersRemoved = 0;
        }
        if (numberOfPassengers == 0) {
            System.out.println("The bus is already empty!");
        }
        numberOfPassengers -= numberOfPassengersRemoved;
        if (numberOfPassengersRemoved > numberOfPassengers) {
            numberOfPassengers = 0;
        }
    }

    public void reachNextStation() {
        currentSpeed = maxSpeed;
        if (numberOfPassengers >= maxPassengers / 2) {
            currentSpeed = maxSpeed / 2;
        }
        System.out.println("The buss: " + brand + " is going to next station!" +
                "\nIt has on board " + numberOfPassengers + "/" + maxPassengers + " passengers, and is going with "
                + currentSpeed + "mpH.");
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String toString() {
        return "Buss brand: " + brand + " (max number of passangers: " + maxPassengers + ", max speed: " + maxSpeed
                + ")\nnow has " + numberOfPassengers + " passengers on board.";
    }
}
