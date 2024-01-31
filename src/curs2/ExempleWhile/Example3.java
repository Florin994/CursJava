package curs2.ExempleWhile;

public class Example3 {
    public static void main(String[] args) throws InterruptedException {
        int i = 10;
        while (i >= 1) {
            Thread.sleep(1000);
            if (i == 5) {
                System.out.println("Motoarele au fost pornite!");
            } else if (i == 1) {
                System.out.println("Raceta s-a lansat!");
            } else {
                System.out.println(i);
            }
            i--;
        }
    }
}
