package com.belajar;

public class LoopingArray {
    public static void main(String[] args) {

        int[] nomor = { 1, 2, 3, 4, 5, 6 };
        System.out.println(nomor[1]);

        // looping standard
        System.out.println("looping standar");
        for (int i = 0; i < 6; i++) {
            System.out.println("indeks ke " + i + " adalah " + nomor[i]);
        }

        // looping dengan properti array
        System.out.println("\nlooping dengan array\n");
        for (int i = 0; i < nomor.length; i++) {
            System.out.println("indeks ke " + i + " adalah " + nomor[i]);
        }

        // looping for each
        System.out.println("\nlooping for each\n");
        for (int angka : nomor) {
            System.out.println("angka pada looping ini = " + angka);
        }
    }
}
