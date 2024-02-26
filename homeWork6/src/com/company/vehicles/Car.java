package com.company.vehicles;

import com.company.details.Engine;
import com.company.professionals.Driver;

public abstract class Car {
    String brandName;
    String classOfCar;
    int weight;
    Driver driver;
    Engine engine;
   public void start(){
        System.out.println("Lets GOOOO!!!");
    };
    public void stop(){
        System.out.println("Where is the Brakes??? AAAAAHHHHH!!!");
    };

    public void turnLeft(){
        System.out.println("turn left, I said Left, PLEEASE");
    }

    public void turnLRight(){
        System.out.println("turn left, I said Right, PLEEASE");
    }

    public Car(String brandName, String classOfCar, int weight, Driver driver, Engine engine) {
        this.brandName = brandName;
        this.classOfCar = classOfCar;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", classOfCar='" + classOfCar + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
