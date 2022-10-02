package com.example.lib;

public class Phone {
    String number = "+375 44 174 43 31";
    String model = "not known";
    int weight = 111;
    String name = "not known caller";

    void receiveCall(){
        System.out.println(name + " is calling");
    }
    void getNumber(){
        System.out.println(number);
    }
    void getNumber(String name, String number){
        System.out.println(name + " is calling" + "\n" + number);
    }
    void sendMessage(String number){
        System.out.println(number + " message sent successfully");
    }
    public Phone(){
    }
    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone(String number, String model, int weight){
        this(number, model);
        this.weight = weight;
    }


}
