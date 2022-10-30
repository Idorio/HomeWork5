package com.example.lib;

public class RunnableThread {
    public static void main(String[] args) {

        ThreadClass3 threadClass = new ThreadClass3();
        threadClass.start();

        RunnableClass runnableClass = new RunnableClass();
        Thread thread = new Thread(runnableClass);
        thread.start();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("third stream");
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                System.out.println("fourth stream");
            }
        };
        thread2.start();
    }
    }


