package curs5.Polimorfism.Teme.Tema1;

public class Main {
    public static void main(String[] args) {
        Adam adam = new Adam();
        System.out.println(adam.showName()); //Bonus: Decomentati si observati diferentele

        Eva eva = new Eva();
        System.out.println(eva.showName());
        Adam human = new Eva();
        System.out.println(human.showName()); //Bonus: Decomentati si observati diferentele
    }
}
