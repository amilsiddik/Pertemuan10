package com.belajar;

import java.util.Arrays;

public class OpArray {
    public static void main(String[] args) {
        int[] arrayNomor1 = { 1, 2, 3, 4, 5 };

        // merubah array ke string
        System.out.println(Arrays.toString(arrayNomor1));
        ngeprint(arrayNomor1);

        //
    }

    private static void ngeprint(int[] dataArray) {
        System.out.println("array = " + Arrays.toString(dataArray));
    }

}
