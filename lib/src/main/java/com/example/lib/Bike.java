package com.example.lib;

class Bike extends Transportt{

    @Override
    void drive() {
        System.out.println("Bike drive");
    }
    @Override
    void honk() {
        System.out.println("Bike honk");
    }
}