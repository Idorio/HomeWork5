package com.example.lib;


public abstract class Autopark {
    public static void main(String[] args) {
            Traktor traktor =new Traktor();
            Car car = new Car();
            Bike bike = new Bike();
            traktor.drive();
            traktor.honk();
            traktor.StartMotor();
            car.drive();
            car.honk();
            car.StartMotor();
            bike.drive();
            bike.honk();
        }
    }


