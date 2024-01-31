package curs2.ExempleWhile;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valBon = 0;
        double bacnotaIntrodusa = 0;
        double rest = 0;
        int cinciSute = 0;
        int douaSute = 0;
        int oSuta = 0;
        int cinciZeci = 0;
        int douaZeci = 0;
        int zeceLei = 0;
        int cinciLei = 0;
        int unLeu = 0;
        int cinciZeciBani = 0;
        int zeceBani = 0;
        int ciniBani = 0;
        int unban = 0;

        System.out.println("Introduceti valoare bon:");
        valBon = sc.nextDouble();
        System.out.println("Introduceti bacnota:");
        bacnotaIntrodusa = sc.nextInt();
        rest = bacnotaIntrodusa - valBon;
        System.out.printf("Restul dumneavostra este: %.2f\n", rest);
        while (rest != 0) {
//                while (rest >= 500) {
//                    rest -= 500;
//                    cinciSute++;
//                }
            while (rest >= 200) {
                rest -= 200;
                douaSute++;
            }
            while (rest >= 100) {
                rest -= 100;
                oSuta++;
            }
            while (rest >= 50) {
                rest -= 50;
                cinciZeci++;
            }
            while (rest >= 20) {
                rest -= 20;
                douaZeci++;
            }
            while (rest >= 10) {
                rest -= 10;
                zeceLei++;
            }
            while (rest >= 5) {
                rest -= 5;
                cinciLei++;
            }
            while (rest >= 1) {
                rest -= 1;
                unLeu++;
            }
            while (rest >= 0.5) {
                rest -= 0.5;
                cinciZeciBani++;
            }
            while (rest >= 0.10) {
                rest -= 0.10;
                zeceBani++;
            }
            while (rest >= 0.05) {
                rest -= 0.05;
                ciniBani++;
            }
            while (rest > 0.01) {
                rest -= 0.01;
                unban++;
            }
            System.out.printf("Ati primit:\n%d bacnote de 200 de lei, \n%d bacnote de 100 de lei, " +
                            "\n%d bacnote de 50 de lei, \n%d bacnote de 20 de lei, \n%d bacnote de 10 lei," +
                            " \n%d bacnote de 5 lei, \n%d bacnote de 1 leu, \n%d monede de 50 de bani," +
                            " \n%d monede de 10 bani, \n%d monede de 5 bani, \n%d monede de 1 ban.",
                    douaSute, oSuta, cinciZeci, douaZeci, zeceLei, cinciLei, unLeu, cinciZeciBani,
                    zeceBani, ciniBani, unban);
            break;
        }
    }

}



