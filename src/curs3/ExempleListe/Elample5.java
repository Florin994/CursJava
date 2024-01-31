package curs3.ExempleListe;

import java.util.ArrayList;

public class Elample5 {
    public static void main(String[] args) {
        ArrayList<Integer> listaPrincipala = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listaPrincipala.add(i + 1);
        }
        ArrayList<Integer> numerePare = new ArrayList<>();
        ArrayList<Integer> numereImpare = new ArrayList<>();
        for (int i = 0; i < listaPrincipala.size(); i++) {
            if (listaPrincipala.get(i) % 2 == 0) {
                numerePare.add(listaPrincipala.get(i));
            } else {
                numereImpare.add(listaPrincipala.get(i));
            }
        }
        System.out.println("Numere pare: " + numerePare);
        System.out.println("Numere impare: " + numereImpare);
    }
}
