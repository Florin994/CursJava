package curs1.tema;

import java.util.Scanner;

public class SwitchCase1 {
    public static void main(String[] args) {
//        program semafor
        // rosu stop
        // galben atentie
        // verede mergi
        System.out.println("Introduceti o culoare:");
        Scanner sc= new Scanner(System.in);
        String cl = sc.next();
        switch(cl){
            case "rosu":
                System.out.println("Stop");
                break;
            case"galben":
                System.out.println("Atentie");
                break;
            case"verde":
                System.out.println("mergi");
                break;
            default:
                System.out.println("Culoare invalida");
                break;
        }

    }

}
