package curs1.tema;

import java.util.Scanner;

public class PracticaCuSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        1. Scrieți un program care cere de la user un număr de la 1 la 10. Dacă nr introdus este 1,
//        afișați “unu”, dacă e 2, afișați “doi”,samd.. Folosiți switch.

//        System.out.println("Introduceti un numar de la 1 la 10:");
//        int nr = sc.nextInt();
//        switch (nr) {
//            case 1:
//                System.out.println("unu");
//                break;
//            case 2:
//                System.out.println("doi");
//                break;
//            case 3:
//                System.out.println("trei");
//                break;
//            case 4:
//                System.out.println("patru");
//                break;
//            case 5:
//                System.out.println("cinci");
//                break;
//            case 6:
//                System.out.println("sase");
//                break;
//            case 7:
//                System.out.println("sapte");
//                break;
//            case 8:
//                System.out.println("opt");
//                break;
//            case 9:
//                System.out.println("noua");
//                break;
//            case 10:
//                System.out.println("zece");
//                break;
//            default:
//                if (nr < 0) {
//                    System.out.println("prea mic si negativ");
//                } else if (nr > 10) {
//                    System.out.println("prea mare si pozitiv");
//                } else {
//                    System.out.println("Nu ati introdus un numar corespunzator!");
//                }
//        }

//        2. Completați exercițiul anterior cu următoarea conditie: dacă nr introdus este mai mic decât 0,
//        afișați “prea mic si negativ”, dacă e mai mare decât 10, afișați “prea mare si pozitiv”.
//        •  Hint: incercati sa integrati un if() in sectiunea default a switch-ului.

//        3. Scrieți un program care cere o lună calendaristică de la user si afișează anotimpul care corespunde
//        acelei luni. Folosiți switch.

//        System.out.println("Introduceti o luna calendaristica:");
//        String luna = sc.nextLine();
//        String anotimp = "";
//        switch (luna) {
//            case "Ianuarie":
//                anotimp = "Iarna";
//                break;
//            case "Februarie":
//                anotimp = "Iarna";
//                break;
//            case "Martie":
//                anotimp = "Primavara";
//                break;
//            case "Aprilie":
//                anotimp = "Primavara";
//                break;
//            case "Mai":
//                anotimp = "Primavara";
//                break;
//            case "Iunie":
//                anotimp = "Vara";
//                break;
//            case "Iulie":
//                anotimp = "Vara";
//                break;
//            case "August":
//                anotimp = "Vara";
//                break;
//            case "Septembrie":
//                anotimp = "Toamna";
//                break;
//            case "Octombrie":
//                anotimp = "Toamna";
//                break;
//            case "Noiembrie":
//                anotimp = "Toamna";
//                break;
//            case "Decembrie":
//                anotimp = "Iarna";
//                break;
//            default:
//                System.out.println("Nu ati introdus o luna calendaristica");
//                break;
//        }
//        System.out.println("Anotimpul este: " + anotimp);
//    }

//        4. Scrieți un program care cere o notă de la user (de la 1 la 10) și afișează gradul de promovare
//        corespunzător notei. (1-3foarte slab, 4-6 slab, 7-9 bine, 10 foarte bine). Dacă este introdus alt
//        număr, sa apară un mesaj de eroare.

//        System.out.println("Introduceti o nota de la 1 la 10:");
//        int nota = sc.nextInt();
//        String gr = "";
//        switch (nota) {
//            case 1:
//                gr = "foarte slab";
//                break;
//            case 2:
//                gr = "foarte slab";
//                ;
//                break;
//            case 3:
//                gr = "foarte slab";
//                break;
//            case 4:
//                gr = "slab";
//                break;
//            case 5:
//                gr = "slab";
//                break;
//            case 6:
//                gr = "slab";
//                break;
//            case 7:
//                gr = "bine";
//                break;
//            case 8:
//                gr = "bine";
//                break;
//            case 9:
//                gr = "bine";
//                break;
//            case 10:
//                gr = "foarte bine";
//                break;
//            default:
//                System.out.println("Nu ati introdus o nota intre 1 si 10!");
//        }
//        System.out.println(gr);
//    }

//        5. Detector caractere. Scrie un program care cere un caracter special de la user si afișează “ai
//        apasat caracterul ...”. Programul va folosi doar caracterele speciale din dreptul tastelor
//        numerice (! @ # ....... - +).

//        System.out.println("Introduceti un caracter special:");
//        char cr = sc.next().charAt(0);
//        switch (cr) {
//            case '!':
//                System.out.println("Ati apasat caracterul ! (semnul exclamarii)");
//                break;
//            case '@':
//                System.out.println("Ati apasat caracterul @ (arond)");
//                break;
//            case '#':
//                System.out.println("Ati apasat caracterul # (diez)");
//                break;
//            case '$':
//                System.out.println("Ati apasat caracterul $ (dolar)");
//                break;
//            case '%':
//                System.out.println("Ati apasat caracterul % (procent)");
//                break;
//            case '^':
//                System.out.println("Ati apasat caracterul ^ (accent)");
//                break;
//            case '&':
//                System.out.println("Ati apasat caracterul & (and)");
//                break;
//            case '*':
//                System.out.println("Ati apasat caracterul * (steluta)");
//                break;
//            case '(':
//                System.out.println("Ati apasat caracterul ( (paranteza rodunda deschisa)");
//                break;
//            case ')':
//                System.out.println("Ati apasat caracterul ) (paranteza rodunda inchisa)");
//                break;
//            default:
//                System.out.println("Nu ati introdus un caracter corespunzator!");
//        }

//        6. Scrieți un program care cere de la user un caracter și verifică dacă este vocală sau consoană.

        System.out.println("introduceti o litera:");
        char crIntrodus = sc.next().charAt(0);
        String rezultat = "";
//        switch (crIntrodus) {
//            case 'a':
//                rezultat = "vocala";
//                break;
//            case 'e':
//                rezultat = "vocala";
//                break;
//            case 'i':
//                rezultat = "vocala";
//                break;
//            case 'o':
//                rezultat = "vocala";
//                break;
//            case 'u':
//                rezultat = "vocala";
//                break;
////            default:
////                rezultat="consoana";
//            case 'b':
//                rezultat = "consoana";
//                break;
//            case 'c':
//                rezultat = "consoana";
//                break;
//            case 'd':
//                rezultat = "consoana";
//                break;
//            case 'f':
//                rezultat = "consoana";
//                break;
//            case 'g':
//                rezultat = "consoana";
//                break;
//            case 'h':
//                rezultat = "consoana";
//                break;
//            case 'j':
//                rezultat = "consoana";
//                break;
//            case 'k':
//                rezultat = "consoana";
//                break;
//            case 'l':
//                rezultat = "consoana";
//                break;
//            case 'm':
//                rezultat = "consoana";
//                break;
//            case 'n':
//                rezultat = "consoana";
//                break;
//            case 'p':
//                rezultat = "consoana";
//                break;
//            case 'q':
//                rezultat = "consoana";
//                break;
//            case 'v':
//                rezultat = "consoana";
//                break;
//            case 'w':
//                rezultat = "consoana";
//                break;
//            case 'x':
//                rezultat = "consoana";
//                break;
//            case 'y':
//                rezultat = "consoana";
//                break;
//            case 'z':
//                rezultat = "consoana";
//                break;
//            default:
//                System.out.println("Nu ati introdus o litera!");
//        }
        System.out.println(rezultat);
        if (Character.isLetter(crIntrodus)) {
            switch (crIntrodus) {
                case 'a':
                    rezultat = "vocala";
                    break;
                case 'e':
                    rezultat = "vocala";
                    break;
                case 'i':
                    rezultat = "vocala";
                    break;
                case 'o':
                    rezultat = "vocala";
                    break;
                case 'u':
                    rezultat = "vocala";
                    break;
                default:
                    rezultat = "consoana";
            }
        }else {
            System.out.println("Nu ati introdus un caracter corespunzator!");
        }
        System.out.println(rezultat);

    }
}