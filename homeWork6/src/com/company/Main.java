package com.company;

import com.company.details.Engine;
import com.company.professionals.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Car lorry = new Lorry("Mazda",
                "PickUp",2000,
                        new Driver("Valodzkin Anton",20),
                        new Engine(400,"Suzuki"),2000);

        Car maserati = new SportCar("Maserati",
                "sportCar",2000,
                new Driver("IrYna Zakharenko",2),
                new Engine(1000,"Maserati"),400);


        System.out.println(lorry);
        System.out.println(maserati);

        lorry.stop();
        lorry.turnLeft();
        maserati.start();
        maserati.turnLRight();
    }
}
