package com.example.homework7;

public enum  Season{
    WINTER(-15),
    SPRING(7),
    SAMMER(27){
        @Override
        public String getDescription() {
            return "Warn season";
        }
    },
    AUTUMN(15);

    private double MediumTemperature;
    Season(double MediumTemperature){
        this.MediumTemperature = MediumTemperature;
    }

    public double getMediumTemperature(){
        return MediumTemperature;
    }

    public String getDescription(){
        return "Cold season";
    }
}
