package com.example.lib;

public class StartCars extends Exception {
    private final String message;

    StartCars(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
