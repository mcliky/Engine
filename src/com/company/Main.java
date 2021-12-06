package com.company;

import details.Engine;
import professions.Driver;
import vehicles.Car;

public class Main {

    public static void main(String[] args) {
        Driver oleg = new Driver("Oleg", "2.10.1995", 15);
        Car car = new Car("1234", "A", oleg, new Engine(200, "Mustang"));
        System.out.println(car.toString());
        oleg.countAge();
    }
}
