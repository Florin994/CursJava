package curs3.ExempleListe;

import java.sql.Array;
import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
//        sa se declare un array numit masini cu dimensiunea de 6 elemente, sorteaza elementele si printeaza ultimele doua elemente
        String[] masini = new String[6];
        masini[0] = "dacia";
        masini[1] = "audi";
        masini[2] = "volvo";
        masini[3] = "mercedes";
        masini[4] = "vw";
        masini[5] = "renault";
        Arrays.sort(masini);
        for (String m : masini) {
            System.out.println(m);
        }
        System.out.println();
        System.out.println(("Ultimul element este: " + masini[masini.length - 1]) +
                "\nSi penultimul element este: " + masini[(masini.length - 2)]);
        String[] masiniCopiate = new String[6];
        for (int i = 0; i < masini.length; i++) {
            masiniCopiate[i] = masini[i];
//            System.out.println(masiniCopiate[i]);
        }
        System.out.println(Arrays.toString(masiniCopiate));
    }
}
