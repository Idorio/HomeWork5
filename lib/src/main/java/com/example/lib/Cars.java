package com.example.lib;

class Cars {
    Iwheelturn wheelturn;

    Cars(Iwheelturn action) {
        this.wheelturn = action;
    }

    public void drive() {
        wheelturn.spinthewheels();
    }
}
