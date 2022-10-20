package com.example.lib.masives;

public class HomeWork9_3 {
    public static void main(String[] args) {
        int[] massiv = new int[15];
        int a = 0;
        for (int i = 0; i < massiv.length ; i++) {
            massiv[i] = (int) (Math.random() * 99);
            if (massiv[i] % 2 == 0) {
                a++;
            }
            System.out.print(massiv[i] + " ");
        }

        System.out.println("\nnumber of even numbers " + a);
    }
}
