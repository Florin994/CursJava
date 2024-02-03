package curs5.Abstractizare.Teme.Tema1;

public class Airplane implements Flyable {
    @Override
    public String fly() {
        return "The airplane is flying";
    }

    @Override
    public String getVehicleType() {
        return "Airplane";
    }

    @Override
    public void showInfo() {
        System.out.println(getVehicleType() + " " + fly());

    }
}
