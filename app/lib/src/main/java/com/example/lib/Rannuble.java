package com.example.lib;

public class Rannuble {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                System.out.println("Passing a Runnable stream");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}



