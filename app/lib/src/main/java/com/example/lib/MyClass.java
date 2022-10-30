package com.example.lib;

public class MyClass {
    public static void main(String[] args) {

        ThreadClass threadClass = new ThreadClass();
        threadClass.start();
        ThreadClass2 threadClass2 = new ThreadClass2();
        Thread thread2 = new Thread(threadClass2);
        thread2.start();

    }

}




//    long start = System.currentTimeMillis();
//        System.out.println("Start in 5 seconds: "
//                + Thread.currentThread().getName()+ " " + start);