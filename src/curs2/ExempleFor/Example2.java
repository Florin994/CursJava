package curs2.ExempleFor;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        String pr = " ";

        for (int i = 1; i <= 5; i++) {
            System.out.println("Introduceti un cuvantul:");
            String cuvant = sc.nextLine();
            str.append(cuvant).append(" ");
        }
        System.out.println(str);

    }
}
