package com.company.vehicles;

import com.company.details.Engine;
import com.company.professionals.Driver;

public class Lorry extends Car{
    int maximumLoadWeight;

    public Lorry(String brandName, String classOfCar, int weight, Driver driver, Engine engine, int maximumLoadWeight) {
        super(brandName, classOfCar, weight, driver, engine);
        this.maximumLoadWeight = maximumLoadWeight;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "maximumLoadWeight=" + maximumLoadWeight +
                ", brandName='" + brandName + '\'' +
                ", classOfCar='" + classOfCar + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
