package com.company.vehicles;

import com.company.details.Engine;
import com.company.professionals.Driver;

public class SportCar extends Car{
    int maximumSpeed;

    public SportCar(String brandName, String classOfCar, int weight, Driver driver, Engine engine, int maximumSpeed) {
        super(brandName, classOfCar, weight, driver, engine);
        this.maximumSpeed = maximumSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "maximumSpeed=" + maximumSpeed +
                ", brandName='" + brandName + '\'' +
                ", classOfCar='" + classOfCar + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
