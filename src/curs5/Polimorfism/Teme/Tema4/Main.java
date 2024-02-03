package curs5.Polimorfism.Teme.Tema4;

public class Main {
    public static void main(String[] args) {
        print(true);
        print("Hi! My name is Florin");
        print(29);
        print(29.3);
        print(29.3f);
    }

    static void print(boolean b) {
        System.out.println(b);
    }

    static void print(String s) {
        System.out.println(s);
    }

    static void print(int i) {
        System.out.println(i);
    }

    static void print(double d) {
        System.out.println(d);
    }

    static void print(float f) {
        System.out.println(f);
    }
}
