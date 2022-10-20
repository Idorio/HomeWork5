package com.example.lib.massmassive;

import java.util.Arrays;

public class HomeWokr9_2_1 {
    public static void main(String[] args) {

        int[][] numbers = new int[3][3];
        numbers[0][0] = 24;
        numbers[0][1] = 33;
        numbers[1][0] = 11;
        numbers[1][1] = 15;
        numbers[0][2] = 42;
        numbers[2][0] = 44;
        numbers[1][2] = 77;
        numbers[2][1] = 13;
        numbers[2][2] = 97;

        for (int[] array : numbers) {
            System.out.println(Arrays.toString(array));
        }
    }
}
