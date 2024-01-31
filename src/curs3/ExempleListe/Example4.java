package curs3.ExempleListe;


import java.util.Arrays;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti capacitatea listei de numere:");
        int n = sc.nextInt();
        String[] listaCuvinte = {"Fizz", "Buzz", "FizzBuzz"};
        Integer[] listaNumere = new Integer[n];

        for (int i = 0; i < n - 1; i++) {
            listaNumere[i] = i + 1;
        }
        for (int i = 0; i < n - 1; i++) {
            if (listaNumere[i] % 3 == 0 && listaNumere[i] % 5 == 0) {
                System.out.println(listaCuvinte[2]);
            } else if (listaNumere[i] % 3 == 0) {
                System.out.println(listaCuvinte[0]);
            } else if (listaNumere[i] % 5 == 0) {
                System.out.println(listaCuvinte[1]);
            } else {
                System.out.println(listaNumere[i]);
            }
        }
    }
}
