package com.example.lib;

public class Store {
    private int product = 0;

        synchronized void get() {
            while (product < 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.print("get interrupted");
                }
            }
            product--;
            System.out.println("consumer bought 1 product");
            System.out.println("products in stock: " + product);
            notify();
        }

        synchronized void put() {
            while (product >= 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.print("get interrupted");
                }
            }
            product++;
            System.out.println("producer made 1 product");
            System.out.println("products in stock: " + product);
            notify();
        }
    }

