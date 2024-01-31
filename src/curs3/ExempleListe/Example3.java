package curs3.ExempleListe;

import java.util.Arrays;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
//        sa se citeasca de la user un numar int n, sa se declare un array de tip double cu dimensiunea n si sa se initializeze cu n valori
//        sorteaza arrayul folosind una dintre metodele clasei Arrays
//        declara un al doilea array cu dimensiunea n si copiaza elementele(sortate) din primul array
//        si afiseaza al doilea array la consola
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un numar:");
        int n = sc.nextInt();
        Double[] lista1 = new Double[n];
        for (int i = 0; i < lista1.length; i++) {
            System.out.println("Introduceti un nr double:");
            double nrIntrodus = sc.nextDouble();
            lista1[i] = nrIntrodus;
        }
        Arrays.sort(lista1);

        Double[] lista2 = new Double[n];

        for (int i = 0; i < lista1.length; i++) {
            lista2[i] = lista1[i];
            System.out.println("Lista sortata este: " + lista2[i]);
        }
    }
}
