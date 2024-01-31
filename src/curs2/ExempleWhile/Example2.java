package curs2.ExempleWhile;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        int count = 0;
        while (true) {
            System.out.println("Introduceti un nume de animal:");
            String nume = sc.nextLine();
            if (nume.equalsIgnoreCase("Arca este plina")) {
                break;
            }
            str.append(nume).append("; ");
            count++;
        }
        System.out.println("In arca sunt urmatoarele animale:\n"+str);
        System.out.println("Pe arca sunt: " + count + " animale.");
    }
}
