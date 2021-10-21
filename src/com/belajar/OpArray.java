package com.belajar;

import java.util.Arrays;

public class OpArray {
    public static void main(String[] args) {
        int[] arrayNomor1 = { 1, 2, 3, 4, 5 };

        // merubah array ke string
        System.out.println(Arrays.toString(arrayNomor1));
        ngeprint(arrayNomor1);

        // mengkopi array
        System.out.println("\nmengkopi array\n");
        int[] arrayNomor2 = new int[5];
        ngeprint(arrayNomor1);
        // System.out.println("array = " + Arrays.toString(arrayNomor1));
        ngeprint(arrayNomor2);
        // mengkopi dengan loop
        for (int i = 0; i < arrayNomor1.length; i++) {
            arrayNomor2[i] = arrayNomor1[i];
        }
        ngeprint(arrayNomor1);
        ngeprint(arrayNomor2);

        arrayNomor2[2] = 7;
        ngeprint(arrayNomor1);
        ngeprint(arrayNomor2);

        // mengkopi dengan copyOf
        System.out.println("\nmengkopi dengan copyOf\n");
        int[] arrayNomor3 = Arrays.copyOf(arrayNomor1, 3);
        ngeprint(arrayNomor3);

        // mengkopi dengan copyofrange
        System.out.println("\nmengkopi dengan copyofrange\n");
        int[] arraynomor4 = Arrays.copyOfRange(arrayNomor1, 1, 5);
        ngeprint(arraynomor4);

        // fill
        System.out.println("\noperasi fill\n");
        int[] arrayNomor5 = new int[10];
        Arrays.fill(arrayNomor5, 4);
        ngeprint(arrayNomor5);

        // komparasi array
        System.out.println("\noperasi fill\n");
        int[] arrayNomor6 = { 1, 2, 3, 4, 5 };
        int[] arrayNomor7 = { 1, 2, 3, 4, 9 };

        System.out.println(Arrays.equals(arrayNomor6, arrayNomor7));

        if (Arrays.equals(arrayNomor6, arrayNomor7)) {
            System.out.println("array nya sama");
        } else {
            System.out.println("array beda");
        }

        System.out.println(Arrays.compare(arrayNomor6, arrayNomor7));

        // sort array

        int[] arrayNomor8 = { 1, 5, 7, 3, 2, 4 };
        Arrays.sort(arrayNomor8);
        ngeprint(arrayNomor8);
        int[] arrayNomor9 = new int[arrayNomor8.length];
        for (int i = 0; i < arrayNomor8.length; i++) {
            arrayNomor9[i] = arrayNomor8[arrayNomor8.length - (i + 1)];
        }
        ngeprint(arrayNomor9);

    }

    private static void ngeprint(int[] dataArray) {
        System.out.println("array = " + Arrays.toString(dataArray));
    }

}
