package curs5.Abstractizare.Teme.Tema1;

public class Car implements Driveable {
    @Override
    public String drive() {
        return "The car is driving!";
    }

    @Override
    public String getVehicleType() {
        return getClass().getSimpleName();
    }

    @Override
    public void showInfo() {
        System.out.println(getVehicleType() + " " + drive());
    }
}
