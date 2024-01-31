package curs2.ExempleWhile;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();

//        introduceti o culoare si opriti cand se introduce cuvantul stop
        while(true){
            System.out.println("Introduceti o culoare:");
            String culoare =sc.next();
            if(culoare.equalsIgnoreCase("stop")){
                break;
            }
            str.append(culoare).append("\n");
        }
        System.out.println(str);

    }
}
