package com.example.lib.masives;

public class HomeWork9_4 {
    public static void main(String[] args) {

        int[] massiv = new int[20];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = (int) (Math.random() * 20);
            System.out.print(massiv[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % 2 != 0) massiv[i] = 0;
            System.out.print(massiv[i] + " ");
        }
            }
        }

