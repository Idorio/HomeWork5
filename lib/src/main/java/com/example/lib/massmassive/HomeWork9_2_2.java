package com.example.lib.massmassive;

import java.util.Arrays;

public class HomeWork9_2_2 {
    public static void main(String[] args) {

        int[][][]numbers = {
                {
                        {21, 12, 33},
                        {4, 5, 6}
                },
                {
                        {77, 87},
                        {10, 11, 12, 44, 88}
                }
        };
        for(int[][] array : numbers){
            System.out.println(Arrays.deepToString(array));
        }
        System.out.println();
        System.out.println(Arrays.deepToString(numbers));

    }
}
