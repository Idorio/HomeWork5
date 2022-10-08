package com.example.homework7;



public class PrintSeason {
    public static void print(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("I don`t like Winter");
                break;
            case SPRING:
                System.out.println("I don`t like Spring");
                break;
            case SAMMER:
                System.out.println("I don`t like Sammer");
                break;
            case AUTUMN:
                System.out.println("I  like Autumn");
                break;
        }
    }
    public static void PrintAllValue(){
        for (Season i : Season.values()){
            System.out.println(i +" " + i.getMediumTemperature()+ " " + i.getDescription() );
        }
    }
}