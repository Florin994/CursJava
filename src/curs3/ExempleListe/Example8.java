package curs3.ExempleListe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        ArrayList<String> masini = new ArrayList<>();
        masini.add("audi");
        masini.add("dacia");
        masini.add("vw");
        String[] masiniCopiate = new String[masini.size()];
        masini.toArray(masiniCopiate);
        System.out.println("Arrayul nostru are valoarea: " + Arrays.toString(masiniCopiate));
    }
}
