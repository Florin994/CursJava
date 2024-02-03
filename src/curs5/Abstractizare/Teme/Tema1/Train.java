package curs5.Abstractizare.Teme.Tema1;

public class Train implements Driveable {
    public String drive() {
        return "The train is traveling.";
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
