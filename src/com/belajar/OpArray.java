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
        int[] arrayNomor3 = Arrays.copyOf(arrayNomor1, 5);
        ngeprint(arrayNomor3);

    }

    private static void ngeprint(int[] dataArray) {
        System.out.println("array = " + Arrays.toString(dataArray));
    }

}
