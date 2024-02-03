package curs5.Polimorfism.Teme.Tema5;

public class Main {
    public static void main(String[] args) {
        System.out.println(getMinimum(2, 7));
        System.out.println(getMinimum(999999999, 789999999));
        System.out.println(getMinimum(2.7, 2.0, 2.1));
    }

    static int getMinimum(int x, int y) {
        if (x < y) {
            return x;
        } else if (x == y) {
            return 0;
        }
        return y;
    }

    static long getMinimum(long x, long y) {
        if (x < y) {
            return x;
        } else if (x == y) {
            return 0;
        }
        return y;
    }

    static double getMinimum(double x, double y, double z) {
        if (x < y && x < z) {
            return x;
        } else if (y < x && y < z) {
            return y;
        }
        return z;
    }
}
