package curs5.Abstractizare.Teme.Tema2;

abstract class Assets {
    protected double price;

    protected Assets(double price) {
        this.price = price;
    }

    protected abstract String getValue();

    abstract String getAssetType();

}
