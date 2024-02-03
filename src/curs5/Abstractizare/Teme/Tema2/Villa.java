package curs5.Abstractizare.Teme.Tema2;

public class Villa extends Assets {
    protected Villa(double price) {
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
