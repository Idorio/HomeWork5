package com.example.lib;

abstract class Bird {


        abstract void fly();
    }

    class Pigeon extends Bird{
        @Override
        void fly() {
            System.out.println("i am a dove and i fly");
        }
    }

    class Crow extends Bird{
        @Override
        void fly() {
            System.out.println("I am a crow and I fly");
        }
}
