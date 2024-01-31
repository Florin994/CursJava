package curs5.Abstractizare.Interfete;

public class Pigeon extends Bird implements Flyable {
    public void fly() {
        System.out.println(breed + " is flying");
    }
}
