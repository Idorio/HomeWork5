package com.example.lib.masives;

import java.util.Arrays;

public class HomeWork9_6 {
    public static void main(String[] args) {

        int[] massive = {21, 71, 55, 20, 29, 5, 7, 10, 19, 18, 23, 70};
        boolean Sorted = false;
        int buffer;
        while(!Sorted){
            Sorted = true;
            for(int i = 0; i < massive.length-1; i++){
                if(massive[i] > massive[i+1]){
                    Sorted = false;

                    buffer = massive[i];
                    massive[i] = massive[i+1];
                    massive[i+1] = buffer;
                }
            }
        }
        System.out.print(Arrays.toString(massive));


    }
}
