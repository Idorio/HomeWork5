package com.example.lib;

public class HomeWork_5 {
    public static void main(String[] args) {
        Phone samsung = new Phone();
        Phone nokia = new Phone();
        Phone xiaomi = new Phone();

        System.out.println(samsung.number);
        System.out.println(samsung.model);
        System.out.println(samsung.weight);

        System.out.println(nokia.number);
        System.out.println(nokia.model);
        System.out.println(nokia.weight);

        System.out.println(xiaomi.number);
        System.out.println(xiaomi.model);
        System.out.println(xiaomi.weight);

        samsung.receiveCall();
        samsung.getNumber();
        nokia.receiveCall();
        nokia.getNumber();
        xiaomi.receiveCall();
        xiaomi.getNumber();

        samsung.getNumber("Lexa","+375 29 644 70 30");
        nokia.getNumber("Jeka", "+375 44 134 14 34");
        xiaomi.getNumber("Tatsiana", "+375 33 861 92 76");
        nokia.sendMessage("+375 33 174 43 31");


        Pigeon pigeon = new Pigeon();
        Crow crow = new Crow();
        pigeon.fly();
        crow.fly();
    }


  public static void  Birds(){
        Pigeon pigeon = new Pigeon();
        Crow crow = new Crow();
        pigeon.fly();
        crow.fly();
    }


}