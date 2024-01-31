package curs1.tema;

import java.util.Scanner;

public class IfElseOperatori {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        1. Creați o aplicație care cere trei numere de la utilizator și îl găsește și afișează
//        pe cel mai mic dintre ele.

//        System.out.println("Introduceti primul numar:");
//        int n1 = sc.nextInt();
//        System.out.println("introduceti al doilea numar:");
//        int n2 = sc.nextInt();
//        System.out.println("introduceti al treilea numar:");
//        int n3 = sc.nextInt();
//        if(n1 < n2 && n1 < n3){
//            System.out.println(n1);
//        } else if (n2<n1 && n2 < n3) {
//            System.out.println(n2);
//        } else if (n3<n1 && n3 < n2) {
//            System.out.println(n3);
//        }

//        2. Creați o aplicație în care utilizatorul introduce un număr între 1 și 100. Dacă numărul este mai mic
//        decât 50, aplicația noastră va afișa multiplicarea lui cu 5. Dar dacă numărul este mai mare decât 50,
//        aplicația noastră va afișa multiplicarea lui cu 2, și dacă numărul este impar, va afișa multiplicarea lui cu 3.
//        Notă: Dacă numarul introdus este mai mare decât 100 sau mai mic decât 1, programul va afișa un mesaj de eroare.

//        System.out.println("Introduceti un numar:");
//        int nr = sc.nextInt();
//        if (nr >= 1 && nr <= 100) {
//            if (nr >= 50 && nr % 2 != 0) {
//                System.out.println(nr * 3);
//            } else if (nr < 50) {
//                System.out.println(nr * 5);
//            } else {
//                System.out.println(nr * 2);
//            }
//        } else {
//            System.out.println("Numarul introdus nu este in intervalul dorit!");
//        }

//        3. Scrieți un program Java care determină gradul studentului în varianta Americană.
//           Programul să citească trei tipuri de scoruri scorQuizz, scorMediu și scorFinal și determină gradul în
//           conformitate cu următoarele reguli:
//                - dacă media scorurilor e mai mare sau egală cu 90% studentul are gradul A
//                - dacă media scorurilor e între 70% si 90% studentul are gradul B
//                - dacă media scorurilor e între 50% si 70% studentul are gradul C
//                - dacă media scorurilor e sub 50% studentul are gradul F
//
//        Notă: Scorurile pot avea valori între 0 și 100. Dacă se introduce altceva, să se afișeze un mesaj de eroare.

//        System.out.println("Introduceti scorul Quizz:");
//        int scorQuizz = sc.nextInt();
//        if (scorQuizz < 0 || scorQuizz > 100) {
//            System.out.println("Scorul intordus este incorect!");
//            System.exit(0);
//        }
//        System.out.println("Introduceti scorul mediu:");
//        int scorMediu = sc.nextInt();
//        if (scorMediu < 0 || scorMediu > 100) {
//            System.out.println("Scorul intordus este incorect!");
//            System.exit(0);
//        }
//        System.out.println("Introduceti scorul Final:");
//        int scorFinal = sc.nextInt();
//        if (scorFinal < 0 || scorFinal > 100) {
//            System.out.println("Scorul intordus este incorect!");
//            System.exit(0);
//
//        }
//        int media = (scorQuizz + scorMediu + scorFinal) / 3;
//        char grad;
//        if (media >= 90) {
//            grad = 'A';
//        } else if (media >= 70) {
//            grad = 'B';
//        } else if (media >= 50) {
//            grad = 'C';
//        } else {
//            grad = 'F';
//        }
////        System.out.println(media);
//        System.out.println("Gradul final al elevului este: " + grad);

    }
}
