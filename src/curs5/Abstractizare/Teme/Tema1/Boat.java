package curs5.Abstractizare.Teme.Tema1;

public class Boat implements Navigable {
    @Override
    public String navigate() {
        return "The boat is sailing.";
    }

    @Override
    public String getVehicleType() {
        return getClass().getSimpleName();
    }

    @Override
    public void showInfo() {
        System.out.println(getVehicleType() + " " + navigate());
    }
}
