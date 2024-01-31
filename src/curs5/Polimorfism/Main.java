package curs5.Polimorfism;

public class Main {
    public static void main(String[] args) {

    }

    static void add() {
        System.out.println(5 + 3);
    }

    static void add(int n) {
        System.out.println(n + 3);
    }

    static void add(String name) {
        System.out.println(name + 3);
    }

    static void add(String name, int age) {
        System.out.println(name + age);
    }

    static void add(int age, String name) {
        System.out.println(name + age);
    }
}
