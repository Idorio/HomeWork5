package com.example.lib;


public class HomeWork8{
    public static void main(String[] args) {
        Cars Lada = new Cars("Granta",145,21000);
        Cars Kia = new Cars("Rio", 180,31000);
        Cars Ford = new Cars("Mondeo",190,29000);

        try {
          Lada.startCar();
            }catch (StartCars e){
            System.out.println(Lada.getModel()+e.getMessage());
        }
        try {
            Kia.startCar();
        }catch (StartCars e){
            System.out.println(Kia.getModel()+e.getMessage());
        }
        try {
            Ford.startCar();
        }catch (StartCars e){
            System.out.println(Ford.getModel()+e.getMessage());
        }


    }
}