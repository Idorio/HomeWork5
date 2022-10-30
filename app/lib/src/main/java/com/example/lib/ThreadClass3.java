package com.example.lib;

public class ThreadClass3 extends Thread {

        @Override
       public void run() {
            System.out.println("First stream ");
        }
    }

    class RunnableClass implements Runnable {
        @Override
        public void run() {
            System.out.println("Second stream");
        }
    }

