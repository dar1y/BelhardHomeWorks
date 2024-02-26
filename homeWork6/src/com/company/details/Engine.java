package com.company.details;

public class Engine {
    int HorsePowers;
    String brand;

    public Engine(int horsePowers, String brand) {
        HorsePowers = horsePowers;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "HorsePowers=" + HorsePowers +
                ", brand='" + brand + '\'' +
                '}';
    }
}
