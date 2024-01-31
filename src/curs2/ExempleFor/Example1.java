package curs2.ExempleFor;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
//        for (int i =1; i<=5; i++){
//            System.out.print("Florin ");
//        }
        Scanner sc = new Scanner(System.in);
        String pr = " ";

        for (int i = 1; i <= 5; i++) {
            System.out.println("Introduceti un cuvantul:");
            String cuvant = sc.nextLine();
             pr += cuvant+" ";
        }
        System.out.println(pr);

    }
}
