package curs6;

public class Exceptions1 {
    public static void main(String[] args) {
        System.out.println("Java");
        int number = 7;
        try {
            System.out.println(number / 0);
            System.out.println("Python");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Hello!");
        }
    }
}
