package curs3.Tema;

import java.util.ArrayList;
import java.util.Scanner;

public class Tema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

//        1. Declarați o listă flori. Adăugați 6 elemente la alegere (nu de la consolă).
//• Adăugați culoarea rosu pe poziția 3 și culoarea albastru pe poziția 1.
//• Ștergeți două flori la alegere.
//• Sortați lista apoi afișați elementele în ordine inversă.
// Hint: puteți folosi metodele sort() și reverse() pe care le puteți găsi cu ajutorul clasei Collections.
//        ArrayList<String> flori = new ArrayList<>();
//        flori.add("ghiocel");
//        flori.add("lalea");
//        flori.add("cactus");
//        flori.add("trandafir");
//        flori.add("orhidee");
//        flori.add("craciunita");
//        System.out.println(flori);
//        flori.add(3, "rosu;");
//        flori.add(1, "albastru;");
//        System.out.println(flori);
//        flori.remove("ghiocel");
//        flori.remove("craciunita");
//        Collections.sort(flori);
//        System.out.println(flori.reversed());

//        2. Declarați o listă mașini. Adăugați 5 mașini citite de la Consolă. Sortați lista și afișați elementele
//        pe același rând, cu spațiu între ele.
//        ArrayList<String> masini = new ArrayList<>();
//        System.out.println("Introduceti o masina:");
//        String masina1 = sc.next();
//        masini.add(masina1);
//        System.out.println("Introduceti o masina:");
//        String masina2 = sc.next();
//        masini.add(masina2);
//        System.out.println("Introduceti o masina:");
//        String masina3 = sc.next();
//        masini.add(masina3);
//        System.out.println("Introduceti o masina:");
//        String masina4 = sc.next();
//        masini.add(masina4);
//        System.out.println("Introduceti o masina:");
//        String masina5 = sc.next();
//        masini.add(masina5);
//        Collections.sort(masini);
//        for (String m : masini) {
//            System.out.print(m + " ");
//        }

//        3. Declarați o listă de double fractii. Adăugați 7 numere citite de la Consolă. Afișați suma și
//        produsul lor sub forma: “Suma numerelor este ..., iar produsul este ...”
//        ArrayList<Double> fractii = new ArrayList<>();
//        System.out.println("(1)Introduceti un numar double:");
//        double nr1 = sc.nextDouble();
//        fractii.add(nr1);
//        System.out.println("(2)Introduceti un numar double:");
//        double nr2 = sc.nextDouble();
//        fractii.add(nr2);
//        System.out.println("(3)Introduceti un numar double:");
//        double nr3 = sc.nextDouble();
//        fractii.add(nr3);
//        System.out.println("(4)Introduceti un numar double:");
//        double nr4 = sc.nextDouble();
//        fractii.add(nr4);
//        System.out.println("(5)Introduceti un numar double:");
//        double nr5 = sc.nextDouble();
//        fractii.add(nr5);
//        System.out.println("(6)Introduceti un numar double:");
//        double nr6 = sc.nextDouble();
//        fractii.add(nr6);
//        System.out.println("(7)Introduceti un numar double:");
//        double nr7 = sc.nextDouble();
//        fractii.add(nr7);
//        double suma = 0.0;
//        double produs = 1.0;
//        for (int i = 0; i < fractii.size(); i++) {
//            suma += fractii.get(i);
//            produs *= fractii.get(i);
//        }
//        System.out.println("Suma este: " + suma);
//        System.out.println("Produsul este: " + produs);

//        4. Scrie un program care să identifice și să afișeze primul și ultimul element dintr-o listă.
//        ArrayList<Integer> lista = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            lista.add(i, i + 3);
//        }
//        System.out.println(lista);
//        System.out.println("Primul element din lista este: " + lista.get(0));
//        System.out.println("Ultimul element din lista este: " + lista.get(lista.size() - 1));

//        5. Scrie un program care să afișeze al doilea cel mai mare element dintr-o listă.
//        ArrayList<Integer> listaNumere = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            listaNumere.add(i, i + 1);
//        }
//        Collections.sort(listaNumere);
//        System.out.println(listaNumere);
//        System.out.println("Al doilea cel mai mare element este: " + listaNumere.get(listaNumere.size() - 2));

//        6. Scrie un program care să insereze un element într-un array la o poziție specificată.
//        ArrayList<String> elemente = new ArrayList<>();
//        Collections.addAll(elemente, "mere", "pere", "struguri", "ananas");
//        System.out.println(elemente);
//        System.out.println("Specificati indexul la care vreti sa introduceti un element nou( intre 0 si "
//                + (elemente.size() - 1) + "):");
//        int index = sc.nextInt();
//        System.out.println("Introduceti un fruct pentru indexul de mai sus:");
//        String element = scan.nextLine();
//        elemente.add(index, element);
//        System.out.println(elemente);

//        7. Scrie un program care să șteargă un element dintr-un array la o poziție specificată.
//        ArrayList<String> elemente = new ArrayList<>();
//        Collections.addAll(elemente, "mere", "pere", "struguri", "ananas");
//        System.out.println(elemente);
//        System.out.println("Introduceti indexul pe care doriti sa il stergeti:");
//        int index = sc.nextInt();
//        elemente.remove(index);
//        System.out.println(elemente);

//        8. Scrie un program care să separe elementele dintr-o listă în alte 2 liste (pare și impare).
//        ArrayList<Integer> listaNumere = new ArrayList<>();
//        ArrayList<Integer> listaNumerePare = new ArrayList<>();
//        ArrayList<Integer> listaNumereImpare = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            listaNumere.add(i, i + 3);
//        }
//        for (int i : listaNumere) {
//            if (i % 2 == 0) {
//                listaNumerePare.add(i);
//            } else {
//                listaNumereImpare.add(i);
//            }
//        }
//        System.out.println(listaNumere);
//        System.out.println(listaNumerePare);
//        System.out.println(listaNumereImpare);

//        9. Scrie un program care să afișeze câte duplicate sunt într-o listă.
//        ArrayList<String> elemente = new ArrayList<>();
//        Collections.addAll(elemente, "mere", "mere", "pere", "struguri", "ananas", "mere", "pere");
//        int count = 0;
//        for (int i = 0; i < elemente.size(); i++) {
//            for (int j = i + 1; j < elemente.size(); j++) {
//                if (elemente.get(i).equalsIgnoreCase(elemente.get(j))) {
//                    count++;
//                    break;
//                }
//            }
//        }
//        System.out.println("In lista avem: " + count + " elemente duplicate.");

//        10. Scrie un program care să transforme o listă într-un array.
//        ArrayList<String> elemente = new ArrayList<>();
//        Collections.addAll(elemente, "mere", "mere", "pere", "struguri", "ananas", "mere", "pere");
//        String[] elementeCopiate = new String[elemente.size()];
//        for (int i = 0; i < elemente.size(); i++) {
//            elementeCopiate[i] = elemente.get(i);
//        }
//        System.out.println(elemente);
//        System.out.println(Arrays.toString(elementeCopiate));

//        11. Scrie un program care să inverseze două elemente într-o listă.
//        ArrayList<String> lista = new ArrayList<>();
//        Collections.addAll(lista, "a", "b", "c", "d");
//        System.out.println(lista);
//        System.out.println("Introduceti primul index pe care doriti sa il schimbati:");
//        int indexUnu = sc.nextInt();
//        System.out.println("Introduceti indexul cu care doriti sa il schimbati:");
//        int indexDoi = sc.nextInt();
//        String var = lista.get(indexUnu);
//        lista.set(indexUnu, lista.get(indexDoi));
//        lista.set(indexDoi, var);
//        System.out.println(lista);

//        12. Scrie un program care să afișeze toate elementele dintr-o listă folosind foreach, for și while.
//        ArrayList<String> lista = new ArrayList<>();
//        Collections.addAll(lista, "a", "b", "c", "d");
//        System.out.println("Lista cu for each:");
//        for (String s : lista) {
//            System.out.println(s);
//        }
//        System.out.println("Lista cu while:");
//        int i = 0;
//        while (i < lista.size()) {
//            System.out.println(lista.get(i));
//            i++;
//        }

//        13. Scrie un program care să introducă 5 elemente de la user într-o listă folosind for și while.
        ArrayList<Integer> listaFor = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduceti un numar intreg:");
            int nr = sc.nextInt();
            listaFor.add(nr);
        }
        ArrayList<String> listaWhile = new ArrayList<>();
        int index = 0;
        while (index < 5) {
            System.out.println("Introduceti un cuvant:");
            String cuvant = scan.next();
            listaWhile.add(cuvant);
            index++;
        }
        System.out.println(listaFor);
        System.out.println(listaWhile);
        sc.close();
        scan.close();
    }
}
