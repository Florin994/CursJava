package curs3.Tema;

import java.util.Arrays;
import java.util.Scanner;

public class Tema1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println(ridicaLaPutere(2, 3));
//        1. Scrie un program care afișează elementele unui array pe rânduri diferite.
//        String[] lista = {"Ana", "are", "mere", "."};
//        for (int i = 0; i < lista.length; i++) {
//            System.out.println(lista[i]);
//        }

//        2. Scrie un program care afișează toate numerele negative dintr-un array.
//        Integer[] numere = {-1, -2, 0, 1, 2, 3};
//        for (int i : numere) {
//            if (i < 0) {
//                System.out.println(i);
//            }
//        }

//        3. Scrie un program care afișează suma elementelor unui array.
//        Integer[] numere = {-1, -2, 0, 1, 2, 3};
//        int sum = 0;
//        for (int i : numere) {
//            sum += i;
//        }
//        System.out.println("Suma elementelor din lista este: " + sum);

//        4. Scrie un program care afișează produsul elementelor impare dintr-un array.
//        Integer[] numere = {-1, -2, 1, 2, 3};
//        int produs = 1;
//        for (int i : numere) {
//            produs *= i;
//        }
//        System.out.println("Produsul elementelor din lista este: " + produs);

//        5. Scrie un program care să afișeze maximul și minimul unui array.
//        Integer[] numere = {-1, -2, 1, 2, 3};
//        int min = 0;
//        int max = 0;
//        for (int i : numere) {
//            if (min > i) {
//                min = i;
//            } else if (max < i) {
//                max = i;
//            }
//        }
//            System.out.println("Cel mai mic numar este: " + min + "\nCel mai mare numar este: " + max);

//        6. Scrie un program care să afișeze al doilea cel mai mare element dintr-un array.
//        Integer[] numere = {-1, -2, 1, 2, 3, 7};
//        int alDoileaCelMaiMareNumar = 0;
//        int celMaiMareNumar = 0;
//        for (int i : numere) {
//            if (i > celMaiMareNumar) {
//                alDoileaCelMaiMareNumar = celMaiMareNumar;
//                celMaiMareNumar = i;
//            } else if (i > alDoileaCelMaiMareNumar && i != celMaiMareNumar) {
//                alDoileaCelMaiMareNumar = i;
//            }
//        }
//        System.out.println(alDoileaCelMaiMareNumar);

//        7. Scrie un program care să copieze toate elementele dintr-un array în altul.
//        String[] lista = {"Ana", "are", "mere", "."};
//        String[] listaCopiata = new String[lista.length];
//        for (int i = 0; i < lista.length; i++) {
//            listaCopiata[i] = lista[i];
//        }
//        System.out.println(Arrays.toString(listaCopiata));

//        8. Scrie un program care să insereze un element într-un array la o poziție specificată.
//        Integer[] listaNumere = new Integer[10];
//        System.out.println("Introduceti indexul (de la 0 la 9):");
//        int index = sc.nextInt();
//        System.out.println("Introdusceti numarul dorit pentru  a fi adaugat in lista de numere pentru indexul dat:");
//        int valoare = sc.nextInt();
//        listaNumere[index] = valoare;
//        System.out.println(listaNumere[index]);

//        9. Scrie un program care să șteargă un element dintr-un array la o poziție specificată.
//        String[] lista = {"Ana", "are", "mere", "."};
//        System.out.println(Arrays.toString(lista));
//        System.out.println("Introduceti indexul care doriti sa fie sters:");
//        int indexStergere = sc.nextInt();
//        if (indexStergere < 0 || indexStergere > lista.length) {
//            System.out.println("Indexul introdus nu este valid! Introduceti un index intre 0 si "
//                    + (lista.length - 1) + ":");
//            indexStergere = sc.nextInt();
//        }
//        String[] listaNoua = new String[lista.length - 1];
//        int listaNouaIndex = 0;
//
//        for (int i = 0; i < lista.length; i++) {
//            if (i != indexStergere) {
//                listaNoua[listaNouaIndex] = lista[i];
//                listaNouaIndex++;
//            }
//        }
//        System.out.println(Arrays.toString(listaNoua));

//        10. Scrie un program care să sorteze un array.
//        String[] lista = {"a", "d", "b", "f"};
//        System.out.println(Arrays.toString(lista));
//        Arrays.sort(lista);
//        System.out.println(Arrays.toString(lista));

//        11. Scrie un program care să inverseze elementele dintr-un array.
//        String[] lista = {"a", "b", "c", "d"};
//        System.out.println(Arrays.toString(lista));
//        System.out.println("Introduceti primul index pe care doriti sa il schimbati:");
//        int indexUnu = sc.nextInt();
//        System.out.println("Introduceti indexul cu care doriti sa il schimbati:");
//        int indexDoi = sc.nextInt();
//        String var = lista[indexUnu];
//        lista[indexUnu] = lista[indexDoi];
//        lista[indexDoi] = var;
//        System.out.println(Arrays.toString(lista));

//        12. Scrie un program care să afișeze câte duplicate sunt într-un array.
//        String[] listaElemente = {"a", "a", "b", "c", "d", "a", "c"};
//        int count = 0;
//        for (int i = 0; i < listaElemente.length; i++) {
//            for (int j = i + 1; j < listaElemente.length; j++) {
//                if (listaElemente[i].equalsIgnoreCase(listaElemente[j])) {
//                    count++;
//                    break;
//                }
//            }
//        }
//        System.out.println("In lista noastra se repeta " + count + " elemente");

//        13. Scrie un program care să afișeze toate elementele unice dintr-un array.
//        String[] listaElemente = {"a", "a", "b", "c", "d", "a", "c"};
//        int count = 0;
//        for (int i = 0; i < listaElemente.length; i++) {
//            boolean duplicat = false;
//            for (int j = 0; j < i; j++) {
//                if (listaElemente[i].equalsIgnoreCase(listaElemente[j])) {
//                    duplicat = true;
//                    break;
//                }
//            }
//            if (!duplicat) {
//                count++;
//            }
//        }
//        String[] listaElementeUnice = new String[count];
//        int index = 0;
//        for (int i = 0; i < listaElemente.length; i++) {
//            boolean duplicat = false;
//            for (int j = 0; j < i; j++) {
//                if (listaElemente[i].equalsIgnoreCase(listaElemente[j])) {
//                    duplicat = true;
//                    break;
//                }
//            }
//            if (!duplicat) {
//                listaElementeUnice[index++] = listaElemente[i];
//            }
//        }
//        System.out.println(Arrays.toString(listaElemente));
//        System.out.println(Arrays.toString(listaElementeUnice));

//        14. Scrie un program care să copieze toate elementele din 2 array-uri în al 3 lea.
//        String[] primaLista = {"a", "b", "c"};
//        String[] aDouaLista = {"d", "e", "f"};
//        int index = primaLista.length + aDouaLista.length;
//        String[] listaNoua = new String[index];
//        for(int i =0; i< primaLista.length; i++){
//            listaNoua[i]=primaLista[i];
//        }
//        int deAdaugat =primaLista.length;
//        for(int i=0; i< aDouaLista.length; i++){
//            listaNoua[deAdaugat++]=aDouaLista[i];
//        }
//        System.out.println(Arrays.toString(primaLista));
//        System.out.println(Arrays.toString(aDouaLista));
//        System.out.println(Arrays.toString(listaNoua));

//        15. Scrie un program care să separe elementele dintr-un array în alte 2 array-uri (pare și impare).
        Integer[] listaNumere = new Integer[20];
        for (int i = 0; i < listaNumere.length; i++) {
            listaNumere[i] = i + 1;
        }
        int indexUnu = 0;
        int indexDoi = 0;
        int countNumerePare = 0;
        int countNumereImpare = 0;
        for (int i : listaNumere) {
            if (i % 2 == 0) {
                countNumerePare++;
            } else {
                countNumereImpare++;
            }
        }
        Integer[] listaNumerePare = new Integer[countNumerePare];
        Integer[] listaNumereImpare = new Integer[countNumereImpare];
        for (int i : listaNumere) {
            if (i % 2 == 0) {
                listaNumerePare[indexUnu++] = i;
            } else {
                listaNumereImpare[indexDoi++] = i;
            }
        }
        System.out.println(Arrays.toString(listaNumere));
        System.out.println(Arrays.toString(listaNumerePare));
        System.out.println(Arrays.toString(listaNumereImpare));

        sc.close();

//    public static double ridicaLaPutere(double baza, int exponent) {
//        double rezultat = 1.0;
//        for (int i = 0; i < exponent; i++) {
//            rezultat *= baza;
//        }
//        return rezultat;
//    }
    }
}
