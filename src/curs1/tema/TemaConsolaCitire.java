package curs1.tema;

import java.util.Scanner;

public class TemaConsolaCitire {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//    1. Afisati la consolă urmatorul text: “Vreau sa devin programator!”. Apoi afișați la consolă: “Ce vrei sa
//    devii?”, citiți o valoare de la consolă, apoi afișați din nou “vreau sa devin “ + valoarea citită din consolă.
//    Folositi toate cele 3 tipuri de formatare a stringului.

//        System.out.println("Vreau sa devin programator!");
//        System.out.println("Ce vrei sa devi?");
//        String cititor = sc.nextLine();
//        System.out.println("Vreau sa devin " + cititor + "!");
//        System.out.print("Vreau sa devin ");
//        System.out.print(cititor + "!\n");
//        System.out.printf("Vreau sa devin %s!", cititor);

//    2. Cereți de la user 3 numere. Salvați numerele citite de la consolă in 3 variabile. Afișați suma, diferența,
//    produsul și media lor pe rânduri diferite, utilizând formatul: “Suma este: ....”,“Diferenta este: ....“, etc.
//    Încercați să puneți aceste expresii pe rânduri diferite folosind un singur apel al consolei. Hint: “\n”

//        System.out.println("Introduceti primul numar:");
//        int n1 = sc.nextInt();
//        System.out.println("Introduceti al doilea numar:");
//        int n2 = sc.nextInt();
//        System.out.println("Introduceti al treilea numar:");
//        int n3 = sc.nextInt();
//        System.out.print("Suma este: " + (n1 + n2 + n3) + "\nDiferenta este: "
//                + (n1 - n2 - n3) + "\nProdusul este: " + (n1 * n2 * n3) + "\nMedia este: " + (n1 + n2 + n3)/3);

//        3. Scrieți un program care cere o temperatură în grade Celsius pe care o transformă și o afișează în grade
//        Fahrenheit.(găsiți formula pe Google).

//        System.out.println("Introduceti temperatura in grade Celsius:");
//        double tempC = sc.nextDouble();
//        double tempF = (tempC * 9 / 5) + 32;
//        System.out.println("Temperatura in grade Fahrenheit este: " + tempF);

//        4. Scrieți un program care cere un număr (raza cercului) apoi calculează și afișează perimetrul și
//        aria acestuia. (găsiți formulele pe net).

//        System.out.println("Introduceti raza cercului:");
//        double raza = sc.nextDouble();
//        double perimetru = (2 * 3.14159 * raza);
//        double per = (2 * Math.PI * raza);
//
//        double arie = (3.14159 * (raza * raza));
//        double ar = Math.PI * Math.pow(raza, 2);
//
//        System.out.println("Perimetrul este: " + perimetru + " (" + per + ")");
//        System.out.println("Aria este: " + arie + " (" + ar + ")");

//        5. Scrieți un program care să afișeze bradul de Crăciun de la tema trecută, cu următoarele condiții:
//        - să se ceară un caracter de la user: (de exemplu ‘*’)
//        - să se realizeze desenul bradului într-o singură apelare de consolă utilizând sintaxele \n și \t

        System.out.println("Introduceti un caracter:");
        char c = sc.next().charAt(0);
        System.out.print("\t    " + c + "\n\t   " + c + c + c + "\n\t  " + c + c + c + c + c + "\n\t "
                + c + c + c + c + c + c + c + "\n\t" + c + c + c + c + c + c + c + c + c + "\n\t   | |\n\t   | |");
        System.out.println();
        System.out.print("\t    " + c + "\n\t   " + c + c + c + "\n\t  " + c + c + c + c + c + "\n\t "
                + c + c + c + c + c + c + c + "\n\t" + c + c + c + c + c + c + c + c + c + "\n\t   "
                + c + c + c + "\n\t   " + c + c + c);
    }
}
