package curs1.tema;

import java.util.Scanner;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class TemeIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        1. Program Calculator:
//        Scrieți un program care cere de la user 2 numere și un caracter. Dacă caracterul este ‘+’, afișează adunarea
//        numerelor, dacă caracterul este ‘-’, afișează scăderea, și așa mai departe, împărțire, înmulțire.
//        Bonus: calculați puterea pentru caracterul ‘^’, modulo pentru ‘%’, și radical (rădăcina pătrată) pentru ‘V’.

//        System.out.println("Introduceti primul numar:");
//        double n1 = sc.nextDouble();
//        System.out.println("Introduceti al doilea numar:");
//        double n2 = sc.nextDouble();
//        System.out.println("introduceti un caracter - (scadere), + (adunare), * (inmultire), / (impartire),"
//                + " ^ (putere la..), % (modulo) sau V (radical):");
//        char cr = sc.next().charAt(0);
//        if (cr == '-') {
//            System.out.println(n1 - n2);
//        } else if (cr == '+') {
//            System.out.println(n1 + n2);
//        } else if (cr == '*') {
//            System.out.println(n1 * n2);
//        } else if (cr == '/') {
//            System.out.println(n1 / n2);
//        } else if (cr == '^') {
//            System.out.println(pow(n1, n2));
//        } else if (cr == '%') {
//            System.out.println(n1 % n2);
//        } else if (cr == 'V') {
//            System.out.println(sqrt(n1));
//            System.out.println(sqrt(n2));
//        } else {
//            System.out.println("Nu ati introdus un caracter valid!");
//        }

//        2. Program Ghicitoare:
//        Scrieți un program care declară o variabilă numarAscuns = 999. Apoi cere de la user un număr. Dacă numărul
//        introdus la consolă este același cu numărul ascuns, afișează “Ai ghicit!”, dacă e mai mic afișează
//        “mai mult!”, dacă e mai mare afișează “mai putin!”.

//        int numarAscuns = 999;
//        System.out.println("Ghiceste numarul!");
//        int nrIntrodus = sc.nextInt();
//        if (nrIntrodus == numarAscuns) {
//            System.out.println("Ai ghicit!");
//        } else if (nrIntrodus < numarAscuns) {
//            System.out.println("mai mult!");
//        } else if (nrIntrodus > numarAscuns) {
//            System.out.println("mai putin!");
//        } else {
//            System.out.println("Numarul introdus nu este valid");
//        }

//        3. Program AnBisect:
//        Scrieți un program care cere un an de la user (ex: 1845), și calculează dacă anul respectiv este bisect sau
//        nu. (căutați formula pe net).

//        System.out.println("Introduceti un an:");
//        int an = sc.nextInt();
//        if (an % 4 == 0 && an % 100 != 0 && an % 400 != 0) {
//            System.out.println("Anul " + an + " este an bisect");
//        } else if (an % 4 == 0 && an % 100 == 0 && an % 400 == 0) {
//            System.out.println("Anul " + an + " este an bisect!");
//        } else {
//            System.out.println("Anul " + an + " nu este an bisect!");
//        }

    }
}
