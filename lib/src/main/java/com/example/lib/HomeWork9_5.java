package com.example.lib;

import java.util.Arrays;

public class HomeWork9_5 {
    public static void main(String[] args) {
        int[] massiv = new int[12];

        for (int i = 0; i <= massiv.length -5; i++) {
            massiv[i] = (int) (Math.random() * 15);
        }
        Arrays.sort(massiv);
        int index = massiv.length-1;

        System.out.print("array : " + massiv[massiv.length-1] + "\n" +
                "Index : " + index);
    }
}

