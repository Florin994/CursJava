package curs3.ExempleListe;

import java.util.ArrayList;

public class Example6 {
    public static void main(String[] args) {
//         scrie un program care iti creaza o lista si o transforma intr-un ArarayList
        Integer[] lista = new Integer[20];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = i + 1;
        }
        ArrayList<Integer> listaArray = new ArrayList<>();
        for (int i = 0; i < lista.length; i++) {
            listaArray.add(lista[i]);
        }
        System.out.println(listaArray);
    }
}
