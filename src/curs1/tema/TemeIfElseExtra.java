package curs1.tema;

import java.util.Scanner;

public class TemeIfElseExtra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//    1. Scrie un program care cere de la user o luna calendaristica si afiseaza anotimpul
//    corespunzator. Daca luna introdusa nu este valida, sa se afiseze un mesaj de eroare.

//        System.out.println("Introduceti o luna calendaristica:");
//        String luna = sc.nextLine();
//        String anotimp = "";
//        if (luna.equalsIgnoreCase("Ianuarie")) {
//            anotimp = "Iarna";
//        } else if (luna.equalsIgnoreCase("Februarie")) {
//            anotimp = "Iarna";
//        } else if (luna.equalsIgnoreCase("Martie")) {
//            anotimp = "Primavara";
//        } else if (luna.equalsIgnoreCase("Aprilie")) {
//            anotimp = "Primavara";
//        } else if (luna.equalsIgnoreCase("Mai")) {
//            anotimp = "Primavara";
//        } else if (luna.equalsIgnoreCase("Iunie")) {
//            anotimp = "Vara";
//        } else if (luna.equalsIgnoreCase("Iulie")) {
//            anotimp = "Vara";
//        } else if (luna.equalsIgnoreCase("August")) {
//            anotimp = "Vara";
//        } else if (luna.equalsIgnoreCase("Septembrie")) {
//            anotimp = "Toamna";
//        } else if (luna.equalsIgnoreCase("Octombrie")) {
//            anotimp = "Toamna";
//        } else if (luna.equalsIgnoreCase("Noiembrie")) {
//            anotimp = "Toamna";
//        } else if (luna.equalsIgnoreCase("Decembrie")) {
//            anotimp = "Iarna";
//        } else {
//            System.out.println("Luna introdusa nu este valabila");
//        }
//        System.out.println("Anotimpule este: " + anotimp);

//            2. curs1.FizzBuzz. Scrie un program care sa ceara un numar de la user si il afiseaza cu
//    urmatoarele conditii:
//            - daca nr introdus este multiplu de 3, sa se afiseze “Fizz”;
//- daca nr introdus este multiplu de 5, sa se afiseze “Buzz”;
//- daca nr introdus este multiplu si de 3 si de 5, sa se afiseze “curs1.FizzBuzz”;
//- daca nr introdus nu este multiplu de nicio valoare de mai sus, sa se afiseze
//    numarul introdus;

//        System.out.println("Introduceti numar:");
//        int nr = sc.nextInt();
//
//        if (nr % 3 == 0 && nr % 5 == 0) {
//            System.out.println("curs1.FizzBuzz");
//        } else if (nr % 3 == 0) {
//            System.out.println("Fizz");
//        } else if (nr % 5 == 0) {
//            System.out.println("Buzz");
//        } else {
//            System.out.println(nr);
//        }

//3. Scrie un program care cere de la user o litera si afiseaza “vocala”, “consoana”, “cifra”,
//    sau “simbol”, in functie de litera introdusa.

//        System.out.println("Introduceti o litera:");
//        char caracter = sc.next().charAt(0);
//        if (Character.isLetter(caracter)) {
//            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
//                System.out.println("Vocala");
//            }else{
//                System.out.println("Consoana");
//            }
//            }else if (Character.isDigit(caracter)){
//            System.out.println("Cifra");
//        }else {
//            System.out.println("Simbol");
//        }
    }
}
