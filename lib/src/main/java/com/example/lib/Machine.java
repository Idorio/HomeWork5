package com.example.lib;

public class Machine {
    public static void main(String[] args) {
        Cars cars = new Cars(new Drive());
        cars.drive();
    }
}
