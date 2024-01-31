package curs4.Example2;

public class Pistol {
    //        pistolul va avea un tip, modle si calibru
    private String type;
    private String model;
    private double caliber;

    public Pistol(String type, String model, double caliber) {
        this.type = type;
        this.model = model;
        this.caliber = caliber;
    }

    @Override
    public String toString() {
        return "Pistol{" + "type=" + type + ", model=" + model + ", caliber=" + caliber + '}';
    }
}
