package curs3.ExempleListe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti lungimea listei:");
        int n = sc.nextInt();
        ArrayList<Integer> listaArray = new ArrayList<>();
        for (int i = 0; i <= n-1; i++) {
            listaArray.add(i+1);
        }
        Integer[] lista = new Integer[n];
        for (int i = 0; i < listaArray.size(); i++) {
            lista[i] = listaArray.get(i);
        }

        System.out.println(Arrays.toString(lista));
    }
}
