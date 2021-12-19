/*
* Java 1. Homework 3
* @author Darina Guryeva
* @version 19.12.2021
*/

import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {
        int[] arr_bool = { 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 };
        System.out.println(Arrays.toString(arr_bool));
        System.out.println(Arrays.toString(invertArray(arr_bool)));

        isFrom1To100();

        multipleArray();

        setDiagonales();

        System.out.println(Arrays.toString(lenInitValue(8, 5482)));
    }

    static int[] invertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        return array;
    }

    static void isFrom1To100() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
    }

    static void multipleArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] < 6 ? arr[i] * 2 : arr[i]);
            System.out.println(arr[i]);
        }
    }

    static void setDiagonales() {
        int[][] table = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    table[i][j] = 1;
                } else {
                    table[i][j] = 0;
                }
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[] lenInitValue(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

}