package curs4.Exemple;

public class Dog {
    String rasa;
    String culoare;
    int varsta;

    @Override
    public String toString() {
        return "Dog{" +
                "rasa='" + rasa + '\'' +
                ", culoare='" + culoare + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
