package com.example.lib;

class CreditCard {
    String check1 = "7894 4798 4569 9488";
    String check2 = "5555 8798 7866 2452";
    String check3 = "4208 3609 5506 2328";
    int number;
    int balance;

    public CreditCard(int number, int balance) {
        this.number = number;
        this.balance = balance;
    }
    public void balance() {
        System.out.println("Your account balance : " + check1 + " is " + balance + "BYN");
    }
    public void balanceTwo() {
        System.out.println("Your account balance : " + check2 + " is " + balance + "BYN");
    }
    public void balanceTree() {
        System.out.println("Your account balance : " + check3 + " is " + balance + "BYN");
    }
    public void takeOff(int takeoff) {
        balance -= takeoff;
        System.out.println("You have withdrawn " + takeoff + "BYN from your Bank Card");
    }
    public void takeUp(int takeUp) {
        balance += takeUp;
        System.out.println("You have replenished " + takeUp + "BYN from your Bank Card: " + check3);

    }
}












