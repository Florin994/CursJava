package curs5.Abstractizare.Teme.Tema2;

public class Main {
    public static void main(String[] args) {
        Villa v = new Villa(250000.0);
        LuxuryCar c = new LuxuryCar(2000000.99);
        Yacht y = new Yacht(3000000.99);
        v.showAssetInfo();
        c.showAssetInfo();
        y.showAssetInfo();
    }
}
