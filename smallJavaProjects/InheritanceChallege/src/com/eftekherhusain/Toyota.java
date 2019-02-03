package com.eftekherhusain;

public class Toyota extends Car {
    private int size;
    private int year;
    private int model;

    public Toyota(String name, String size, int wheels, int doors, int gears, boolean isManual, int size1, int year, int model) {
        super(name, size, wheels, doors, gears, isManual);
        this.size = size1;
        this.year = year;
        this.model = model;
    }
    
}
