package com.example.lib;

import static java.lang.Thread.sleep;

class ThreadClass2 implements Runnable {
    @Override
    public void run() {
        try {
            sleep(5000);

        } catch (Exception e) {
        }
        System.out.println("Startup was successful");
    }
}

