package curs1;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        // Cere de la user un nr si afiseaza par sau impar;
        System.out.println("Introduceti un numar:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i%2==0){
            System.out.println("Numarul introdus este par");
        }else {
            System.out.println("Numarul introdus este impar");
        }
    }
}
