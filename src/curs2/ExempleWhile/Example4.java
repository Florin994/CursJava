package curs2.ExempleWhile;

import java.util.Random;
import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) {
//        dupa fiecare numar neghicit ii scadem o viata, vieti initiale 4;
//        daca ghiceste un nr care este divizibil cu 5 a nr initial atunci adaugam o viata;
//        adauga nr incercari
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int numarAscuns = rnd.nextInt(100);
        int count = 0;
        int vieti = 4;
        while (true) {
            System.out.println("Ghiceste numarul!");
            int nrIntrodus = sc.nextInt();
            count++;
            if (nrIntrodus % 7 == 0) {
                vieti++;
                System.out.println("Felicitari! Ai primit o viata!");
            } else if (nrIntrodus == numarAscuns) {
                System.out.println("Ai ghicit!");
                break;
            } else {
                vieti -= 1;
                if (vieti == 0) {
                    System.out.println("Ai pierdut! nu mai ai vieti!");
                    break;
                }
                System.out.println("Ghinion, nu ai ghicit, mai ai " + vieti + " vieti!");
            }

        }
        System.out.println("Numar incercari: " + count);
    }
}
