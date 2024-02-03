package curs5.Polimorfism.Teme.Tema2;
public class Horse extends Animal {

    @Override
    public Animal getChild() {
        return new Horse();
    }
}
