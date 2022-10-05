package com.example.lib;


import java.sql.SQLOutput;

public class Homework6 {
    public static void main(String[] args) {
        System.out.println("First Card");
        CreditCard bankcardOne = new CreditCard( 9999,10000);
        bankcardOne.balance();
        bankcardOne.takeOff(500);
        bankcardOne.balance();
        System.out.println("Second card");
        CreditCard bankcardTwo = new CreditCard(1234,6000);
        bankcardTwo.balanceTwo();
        bankcardTwo.takeOff(73);
        bankcardTwo.balanceTwo();
        System.out.println("Third card");
        CreditCard bankcardThree = new CreditCard(5847,1000);
        bankcardThree.balanceTree();
        bankcardThree.takeUp(28);
        bankcardThree.balanceTree();




    }
}