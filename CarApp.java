package com.company;

public class CarApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car audiCar = new Car("Audi", "Q7", "Black", 200, 2015);
        Car audiCloneCar = (Car) audiCar.clone();
        System.out.println(audiCar.toString());
        System.out.println(audiCloneCar.toString());
    }
}
