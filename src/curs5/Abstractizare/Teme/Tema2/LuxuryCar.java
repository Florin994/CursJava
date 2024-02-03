package curs5.Abstractizare.Teme.Tema2;

public class LuxuryCar extends Assets {
    protected LuxuryCar(double price) {
        super(price);
    }

    @Override
    protected String getValue() {
        return "Value: " + price;
    }

    @Override
    String getAssetType() {
        return getClass().getSimpleName();
    }

    protected void showAssetInfo() {
        System.out.println(getAssetType() + " has " + getValue());
    }
}
