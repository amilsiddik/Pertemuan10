package com.belajar;

import java.util.Arrays;

public class Pbr {
    public static void main(String[] args) {
        int[] arrayNomor1 = { 1, 2, 3, 4, 5 };
        int[] arrayNomor2 = { 7, 8, 9, 10, 11 };

        System.out.println("lokasi memori : " + arrayNomor1);
        System.out.println("lokasi memori : " + arrayNomor2);

        arrayNomor2 = arrayNomor1;

        System.out.println("lokasi memori : " + arrayNomor1);
        System.out.println("lokasi memori : " + arrayNomor2);

        System.out.println("array 1 --> " + Arrays.toString(arrayNomor1));
        System.out.println("array 2 --> " + Arrays.toString(arrayNomor2));

        arrayNomor1[0] = 20;
        arrayNomor2[0] = 30;
        System.out.println("arraynomor1[0] diubah menjadi 20");
        System.out.println("array 1 --> " + Arrays.toString(arrayNomor1));
        System.out.println("array 2 --> " + Arrays.toString(arrayNomor2));

        gantiarray(arrayNomor1);
        System.out.println("method ganti array");
        System.out.println("array 1 --> " + Arrays.toString(arrayNomor1));
        System.out.println("array 2 --> " + Arrays.toString(arrayNomor2));
    }

    private static void gantiarray(int[] arraybaru) {
        for (int baru : arraybaru) {
            System.out.println(baru);
        }
        arraybaru[0] = 12;
        for (int baru : arraybaru) {
            System.out.println(baru);
        }
    }

}
