package curs5.Polimorfism.Teme.Tema2;

public class Cow extends Animal{
    @Override
    public Animal getChild() {
        return new Cow();
    }
}
