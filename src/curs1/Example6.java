package curs1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        // un magazin deschide la 9 si inchide la 22
        // cere de la user o ora si afiseaza daca este inchis sau deschis
        System.out.println("introduceti ora la care doriti sa vizitati magazinul:");
        Scanner sc = new Scanner(System.in);
        double i = sc.nextInt();
        if (i >= 9.00 && i < 22.00) {
            System.out.println("Magazinul este deschis.");
        } else if (i > 24 || i < 0) {
            System.out.println("Ora introdusa nu este valida.");
        } else {
            System.out.println("Magazinul este inchis.");
        }
    }
}
