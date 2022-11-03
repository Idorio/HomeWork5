package com.example.lib;

import static java.lang.Thread.sleep;

public class Lesson13 {
    public static void main(String[] args) {

        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();

    }
}

class Producer implements Runnable{

    Store store;
    Producer(Store store){
        this.store = store;
    }
    @Override
    public void run() {
        for(int i = 1; i < 4; i++){
            try {
                sleep(300);
            }catch (Exception e){
                System.out.println("Expect goods");
            }
            store.put();
        }
    }
}

class Consumer implements Runnable{

    Store store;
    Consumer(Store store){
        this.store = store;
    }
    @Override
    public void run() {
        for(int i = 1; i < 4; i++){
            store.get();
        }
    }
}

