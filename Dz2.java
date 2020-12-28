package ru.geekbrains.lesson1.git;

import java.util.Arrays;

public class Dz2 {
    public static void main(String[] args) {
        // 1)
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        //System.out.println("arr.length: " + arr.length);

        for (int i = 0; i < arr.length; i++ ) {
            arr[i] = arr[i] == 1 ? 0 : 1;
            System.out.println(arr[i] + " ");
        }
        //2
        int[] arr1 = new int[8];
        for (int i = 1, j = 0; i < arr1.length; i++) arr1[i] = j += 3;
        for (int x : arr1) System.out.print(x + " ");

        //3

        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for( int i = 0; i < arr2.length; i++) {
            if(arr2[i] < 6) arr2 [i] *=2;
            System.out.println(arr2[i] + " ");
        }

        //4
        int[][] arr3 = new int [3][3];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0, j1 = arr3[i].length; j < arr3[i].length; j++, j1--) {
                if (i == j || i == (j1 - 1)) arr3[i][j] = 1;
                System.out.print(arr3[i][j] + " ");
            }
        }


    }




}
