package curs1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // cere de la user un nr si afiseaza urmatoarele:
        // - daca numarul este multiplu de 3 afiseaza Fizz
        // - daca numarul este multiplu de 5 afiseaza Buzz
        // - daca numarul este multiplu si de 3 si de 5 afiseaza curs1.FizzBuzz
        // daca nu este multiplu nici de 3 nici de 5 afiseaza numarul;
        System.out.println("Introduceti numar:");
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();

        if (nr % 3 == 0 && nr % 5 == 0) {
            System.out.println("curs1.FizzBuzz");
        } else if (nr % 3 == 0) {
            System.out.println("Fizz");
        } else if (nr % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(nr);
        }

    }
}
