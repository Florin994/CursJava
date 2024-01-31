package curs2.ExempleFor;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
//        introduceti un text la consola, parcurgem textul, si afisam cate vocale, cate consoane, cate majuscule,
//        cate saptii, minuscule sunt in acel text, caractere
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti text:");
        String text = sc.nextLine();
        int vocale = 0;
        int consoane = 0;
        int majuscule = 0;
        int spatii = 0;
        int minuscule = 0;
        int caractere = 0;

        for (int i = 0; i < text.length(); i++) {
            caractere++;
            if (Character.isLetter(text.charAt(i))) {
                switch (text.charAt(i)) {
                    case 'a':
                        vocale++;
                        break;
                    case 'e':
                        vocale++;
                        break;
                    case 'i':
                        vocale++;
                        break;
                    case 'o':
                        vocale++;
                    case 'u':
                        vocale++;
                        break;
                    default:
                        consoane++;
                }
            }
            if (Character.isUpperCase(text.charAt(i))) {
                majuscule++;
            }
            if (Character.isLowerCase(text.charAt(i))) {
                minuscule++;
            }
            if (Character.isSpaceChar(text.charAt(i))) {
                spatii++;
            }
        }
        System.out.printf("Vocale: %d; \nConsoane: %d; \nMajuscule: %d; \nMinuscule: %d; \nSpatii: %d;" +
                " \nCaractere: %d", vocale, consoane, majuscule, minuscule, spatii, caractere);
    }
}

