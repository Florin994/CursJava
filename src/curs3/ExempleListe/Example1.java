package curs3.ExempleListe;

public class Example1 {
    public static void main(String[] args) {
//        sa se declare un array cu 10 elemente si sa afisezi la consola suma tuturor numerelor pare si media aritmetica a numerelor pozitive
        Integer[] listaNr = new Integer[10];
        listaNr[0] = -2;
        listaNr[1] = -1;
        listaNr[2] = 0;
        listaNr[3] = 2;
        listaNr[4] = 3;
        listaNr[5] = 4;
        listaNr[6] = 5;
        listaNr[7] = 6;
        listaNr[8] = 7;
        listaNr[9] = 8;
        int sumaNrPare = 0;
        int sumaNrPoz = 0;
        int count = 0;
        for (int i = 0; i < listaNr.length; i++) {
            if (listaNr[i] % 2 == 0) {
                sumaNrPare += listaNr[i];
            }
            if (listaNr[i] > 0) {
                sumaNrPoz += listaNr[i];
                count++;
            }
        }
        System.out.println("Suma numerelor pare este: " + sumaNrPare);
        System.out.println("Media aritmetica a numerelor pozitive este: " + (sumaNrPoz / count));

    }

}
