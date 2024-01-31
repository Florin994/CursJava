package curs4.Teme.TemaBus;

public class Main {
    public static void main(String[] args) {
//    creaza clasa buss cu urmatoarele prop: String marca, int maxPassagers, int maxSpeed si metodele addPassager
//    si reachNextStation
//    un autobuz nu poate primi mai multi pasageri decat capacitatea sa maxima (maxPassagers)
//    daca un autobuz are mai mult de 1/2 din cap max de pasageri va merge la urmatoarea statie cu 1/2 din viteza
//    sa maxima daca are mai putin de jum din cap de pasageri va merge cu viteza maxima;
//    creaza doua autobuze in care sa aaugi pasageri, fa ambele autobuze sa ajunga la statia urmaotare in moduri
//    diferite (viteze dif) in functie de nr de pasageri

        Bus busOne = new Bus("Mercedes", 30, 60);
        Bus busTwo = new Bus("Renault", 20, 60);
        busOne.addPassengers(40);
        busOne.addPassengers(10);
        busOne.removePassengers(30);
        busOne.reachNextStation();
        busOne.removePassengers(5);
        System.out.println();
        busTwo.addPassengers(10);
        busTwo.reachNextStation();
        System.out.println();
        System.out.println(busOne);
        System.out.println();
        System.out.println(busTwo);
    }
}
