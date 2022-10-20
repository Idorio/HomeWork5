package com.example.lib.massmassive;

import static java.util.Collections.reverseOrder;

import java.util.Arrays;

public class HoweWork9_2_3 {
    public static void main(String[] args) {


        Integer[][] numbers = new Integer[][]{{30, 20, 40, 10}, {60, 90, 70, 50}};
        Arrays.sort(numbers[0]);
        Arrays.sort(numbers[1], reverseOrder());

        for (Integer[] array : numbers) {
            System.out.println(Arrays.toString(array));
        }
    }
}
