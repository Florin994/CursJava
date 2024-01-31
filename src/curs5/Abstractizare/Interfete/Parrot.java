package curs5.Abstractizare.Interfete;

public class Parrot extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println(breed + " is flying");
    }

}
