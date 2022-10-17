package com.example.lib;

public class HomeWork9_2 {
    public static void main(String[] args) {
        int massiv[]=new int[100];
        for (int i =1; i <=massiv.length -1 ; i += 2 ){
            massiv[i]=i;
            System.out.print(massiv[i]+" ");
        }
        System.out.println("");
        for (int b = massiv.length - 1; b >= 0; b -= 2) {
            massiv[b] = b;
            System.out.print(massiv[b] + " ");


        }
    }
}

