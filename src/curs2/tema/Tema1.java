package curs2.tema;

import java.util.Random;
import java.util.Scanner;

public class Tema1 {
    public static void main(String[] args) {
//        creza un program piatra hartie foarfeca cu lupa
//        scor playeri
//        contimuam sa ne jucam?
//        castigator
        Scanner sc = new Scanner(System.in);
        String[] str = {"piatra", "hartie", "foarfeca"};
        Random random = new Random();
        int compWins = 0;
        int playerWins = 0;
        int egaluri = 0;

        while (true) {
            int randomChoise = random.nextInt(str.length);
//            System.out.println("Piatra/ Hartie / Foarfeca:");
//            String computerlay = sc.next();

            String computer = str[randomChoise];
            System.out.println("Piatra/ Hartie / Foarfeca:");
            String player = sc.next();
            System.out.println("Computerul a ales: "+str[randomChoise]);
            if (player.equalsIgnoreCase("hartie") || player.equalsIgnoreCase("piatra")
                    || player.equalsIgnoreCase("foarfeca")) {
                if (computer.equalsIgnoreCase(player)) {
                    System.out.println("Din nou!");
                    egaluri++;
                    continue;
                }
                if (computer.equals("piatra") && player.equalsIgnoreCase("hartie")) {
                    System.out.println("Felicitari ai castigat!");
                    playerWins++;
                }
                if (computer.equals("hartie") && player.equalsIgnoreCase("foarfeca")) {
                    System.out.println("Felicitari ai castigat!");
                    playerWins++;
                }
                if (computer.equals("foarfeca") && player.equalsIgnoreCase("piatra")) {
                    playerWins++;
                    System.out.println("Felicitari ai castigat!");
                }
                if (computer.equals("hartie") && player.equalsIgnoreCase("piatra")) {
                    System.out.println("Din pacate ai pierdut! Computerul este castigatorul");
                    compWins++;
                }
                if (computer.equals("foarfeca") && player.equalsIgnoreCase("hartie")) {
                    System.out.println("Din pacate ai pierdut! Computerul este castigatorul");
                    compWins++;
                }
                if (computer.equals("piatra") && player.equalsIgnoreCase("foarfeca")) {
                    System.out.println("Din pacate ai pierdut! Computerul este castigatorul");
                    compWins++;
                }
                System.out.println("Mai jucam?");
                String againOrNot = sc.next();
                if (againOrNot.equalsIgnoreCase("da")) {
                    System.out.println("Super!");
                }
                else {
                    System.out.println("Jocul s-a terminat!");
                    break;
                }
            } else {
                System.out.println("Din pacate nu ai ales niciuna dintre optiunile valide, jocul s-a terminat! :(");
                break;
            }
        }
        System.out.println("Computerul a castigat de: " + compWins + " ori.");
        System.out.println("Playerul a castigat de: " + playerWins + " ori.");
        System.out.println("Egaluri: " + egaluri);
        if (compWins > playerWins) {
            System.out.println("Computerul este castigator!");
        }
        if (compWins < playerWins) {
            System.out.println("Playerul este castigator! Felicitari!");
        }
        if (compWins == playerWins) {
            System.out.println("Este egalitate!");
        }
        sc.close();
    }
}
