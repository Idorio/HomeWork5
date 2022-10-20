package com.example.lib.massmassive;

import java.util.Arrays;
import java.util.Random;

public class HomeWork9_2_4 {
    public static void main(String[] args) {

        Random random = new Random();
        int[][][] numbers = {
                {
                        {random.nextInt(100), random.nextInt(100), random.nextInt(100)},
                        {random.nextInt(100), random.nextInt(100), random.nextInt(100)}
                },
                {
                        {random.nextInt(100), random.nextInt(100), random.nextInt(100)},
                        {random.nextInt(100), random.nextInt(100), random.nextInt(100)}
                },
                {
                        {random.nextInt(100), random.nextInt(100), random.nextInt(100)},
                        {random.nextInt(100), random.nextInt(100), random.nextInt(100)}
                }
        };
        for (int[][] array : numbers) {
            System.out.println(Arrays.deepToString(array));
        }
    }
}
