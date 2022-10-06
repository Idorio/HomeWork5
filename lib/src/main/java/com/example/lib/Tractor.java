package com.example.lib;


class Traktor extends Transportt implements Istart{

    @Override
    void drive() {
        System.out.println("Tractor drive");
    }
    @Override
    void honk() {
        System.out.println("Tractor honk");
    }

    @Override
    public void StartMotor() {
        System.out.println("Start Motor");

    }
}



