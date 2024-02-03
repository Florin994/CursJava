package curs5.Polimorfism.Teme.Tema2;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Horse();
        Animal cow = animal1.getChild();
        Animal animal2 = new Cow();
        Animal horse = animal2.getChild();
    }
}
