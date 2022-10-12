package com.example.lib;

public class Cars {
    private String model;


    public Cars(String model,int speed,int price) {
        this.model=model;

    }
    public String getModel() {
        return model;
    }

    public  void startCar() throws StartCars  {
        int r = (int) (Math.random()*21);
        if(r % 2 == 0){
            throw   new StartCars(" didn't start");
        }
        else
            System.out.println(getModel() + " successfully started");
    }


}


