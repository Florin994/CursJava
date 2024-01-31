package curs4.Teme.Methods;

import java.util.Scanner;

public class HomeWorkMethods {
    public static void main(String[] args) {
//        1. Scrie o metodă welcome () care cere de la user numele, apoi afișează un salut.
        System.out.println("E01:");
        welcome();
        System.out.println();

//        2. Scrie o metodă welcome1 () care ia ca parametru un String nume, apoi afișează un salut.
        System.out.println("E02:");
        welcome1("Florin");
        System.out.println();

//        3. Scrie o metodă welcome2 () care ia ca parametru un String nume, apoi returnează un salut.
//                Observați diferențele dintre metodele de mai sus.
        System.out.println("E03:");
        System.out.println(welcome2("Bogdan"));
        System.out.println();

//        4. Scrie o metodă add () care declară 3 variabile de tip int,apoi afișează suma lor.
        System.out.println("E04:");
        add();
        System.out.println();

//        5. Scrie o metodă add () care ia ca parametri 3 numere, apoi afișează suma lor.
        System.out.println("E05:");
        add(1, 3, 5);
        System.out.println();

//        6. Scrie o metodă add () care ia ca parametri 3 numere, apoi returnează suma lor.
//                Observați diferențele dintre metodele de mai sus.
        System.out.println("E06:");
        System.out.println(add1(2, 4, 6));
        System.out.println();

//        7. Scrie o metodă showInfo () care ia ca parametri un nume, o vârstă și un oraș, apoi afișează un
//        text cu aceștia.
        System.out.println("E07:");
        showInfo("Florin", 29, "Bucharest");
        System.out.println();

//        8. Scrie o metodă findMinim () care ia ca parametri 3 numere, și îl returnează pe cel mai mic.
        System.out.println("E08:");
        System.out.println(findMinim(5, 3, 6));
        System.out.println();

//        9. Scrie o metodă isPalindrome () care ia ca parametru un text și returnează true dacă acesta
//        este palindom, sau false dacă nu.
        System.out.println("E09:");
        System.out.println(isPalindrome("16461"));
        System.out.println();

//        10. Scrie o metodă fizzBuzz () care ia ca parametru un integer și returnează un String (Fizz, Buzz,
//                sau FizzBuzz),știți deja regulile ☺
        System.out.println("E10:");
        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(15));
        System.out.println(fizzBuzz(11));
        System.out.println();

//        11. Scrie o metodă convertToSeconds () care ia ca parametri un integer și un String, și returnează
//        valoarea în secunde în funcție de acel String (minute, ore, zile, saptamani, luni(30d), ani(365d)).
        System.out.println("E11:");
        System.out.println(convertToSeconds(2, "minutes"));
        System.out.println(convertToSeconds(2, "hours"));
        System.out.println(convertToSeconds(2, "days"));
        System.out.println(convertToSeconds(2, "weeks"));
        System.out.println(convertToSeconds(2, "months"));
        System.out.println(convertToSeconds(2, "years"));

    }

    public static long convertToSeconds(int num, String unitOfTime) {
        if (unitOfTime.equalsIgnoreCase("minutes")) {
            return num * 60L;
        } else if (unitOfTime.equalsIgnoreCase("hours")) {
            return num * 3600L;
        } else if (unitOfTime.equalsIgnoreCase("days")) {
            return num * 86400L;
        } else if (unitOfTime.equalsIgnoreCase("weeks")) {
            return num * 604800L;
        } else if (unitOfTime.equalsIgnoreCase("months")) {
            return num * 18144000L;
        } else if (unitOfTime.equalsIgnoreCase("years")) {
            return num * 6622560000L;
        }
        return num;
    }

    public static String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return "" + number;
    }

    public static boolean isPalindrome(String word) {
//        String reverseWord = "";
//        for (int i = word.length() - 1; i >= 0; i--) {
//            reverseWord += word.charAt(i);
//        }
//        boolean palindrome = true;
//        for (int i = 0; i < word.length(); i++) {
//            if (word.charAt(i) != reverseWord.charAt(i)) {
//                palindrome = false;
//            }
//        }
        boolean palindrome = true;
        int j = word.length() - 1;
        for (int i = 0; i < j; i++) {
            if (word.charAt(i) != word.charAt(j)) {
                palindrome = false;
                break;
            }
            j--;
        }
        return palindrome;
    }

    public static int findMinim(int n1, int n2, int n3) {
        int min = 0;
        if (n1 < n2 && n1 < n3) {
            return min = n1;
        } else if (n2 < n1 && n2 < n3) {
            min = n2;
        } else if (n3 < n1 && n3 < n2) {
            min = n3;
        }
        return min;
    }

    public static String welcome2(String name) {
        return "Hi, " + name + "!";
    }

    public static void welcome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = sc.nextLine();
        System.out.println("Hi, " + name + "!");
    }

    private static void welcome1(String name) {
        System.out.println("Hi, " + name + "!");
    }

    public static void add() {
        int n1 = 3;
        int n2 = 6;
        int n3 = 9;
        System.out.println(n1 + n2 + n3);
    }

    public static void add(int n1, int n2, int n3) {
        System.out.println(n1 + n2 + n3);
    }

    public static int add1(int n1, int n2, int n3) {
        return (n1 + n2 + n3);
    }

    public static void showInfo(String name, int age, String town) {
        System.out.println("Hi! My name is " + name + ", I am " + age + " years old and I am form " + town);
    }
}
