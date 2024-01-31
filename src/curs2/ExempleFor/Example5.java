package curs2.ExempleFor;

public class Example5 {
    public static void main(String[] args) {
        int i = 0;
        for (; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": FizzBuzz");
            }
            if (i % 3 == 0) {
                System.out.println(i + ": Fizz");
            }
            if (i % 5 == 0) {
                System.out.println(i + ": Buzz");
            }
        }
    }
}
