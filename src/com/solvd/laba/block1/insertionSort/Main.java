package com.solvd.laba.block1.insertionSort;


import java.util.Arrays;
import java.util.Random;

public class Main {

    static int drawIntNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Range is not correct");
        }
        return new Random().nextInt(min, max + 1);
    }

    static int[] createArray(int size, int min, int max) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size is out of range");
        }

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = drawIntNumber(min, max);
        }
        return array;
    }

    static int[] insertionSort(int[] array) {
        int[] sortedArr = Arrays.copyOf(array, array.length);

        for (int i = 0; i < sortedArr.length; i++) {
            int temp = sortedArr[i];
            int j = i - 1;

            while (j >= 0 && sortedArr[j] > temp) {
                sortedArr[j + 1] = sortedArr[j];
                j = j - 1;
            }
            sortedArr[j + 1] = temp;
        }
        return sortedArr;
    }

    public static void main(String[] args) {
        int[] arr = createArray(10, 1, 20);
        System.out.println("********************* MAIN ARRAY *********************");
        System.out.println(Arrays.toString(arr));

        int[] sortedArr = insertionSort(arr);
        System.out.println("********************* SORTED ARRAY *********************");
        System.out.println(Arrays.toString(sortedArr));

    }
}
