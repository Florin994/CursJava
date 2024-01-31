package curs4.Example2;

public class MachineGun {
    //        arma va avea tip, modle, calibru, culoare
    private String type;
    private String model;
    private double caliber;
    private String color;

    public MachineGun(String type, String model, double caliber, String color) {
        this.type = type;
        this.model = model;
        this.caliber = caliber;
        this.color = color;
    }

    @Override
    public String toString() {
        return "MachineGun{" + "type=" + type + ", model=" + model + ", caliber=" + caliber + ", color=" + color + '}';
    }
}
