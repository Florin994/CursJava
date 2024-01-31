package curs5.Mostenire;

public class Dog extends Animal {
    private String leashColor;

    public Dog(String name, String color, String leashColor) {
        super(name, color);
        this.leashColor = leashColor;
    }

    @Override
    public String toString() {
        return super.toString() +
                "leashColor='" + leashColor + '\'' +
                '}';
    }
}
