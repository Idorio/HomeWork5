package com.example.lib;

class Car extends Transportt implements Istart{

    @Override
    void drive() {
        System.out.println("Car drive");
    }
    @Override
    void honk() {
        System.out.println("Car honk");
    }

    @Override
    public void StartMotor() {
        System.out.println("Start Motor");
    }
}
