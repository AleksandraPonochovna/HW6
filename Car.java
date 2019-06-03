package com.company;


public class Car implements Cloneable {

    private static String nameCar;
    private static String nameOfModel;
    private static String colorCar;
    private static int maxSpeed;
    private static int yearOfManufacture;

    public Car(String nameCar, String nameOfModel, String colorCar, int maxSpeed, int yearOfManufacture) {
        this.nameCar = nameCar;
        this.nameOfModel = nameOfModel;
        this.colorCar = colorCar;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }

    @Override
    public String toString() {
        return "Name Car - " + nameCar
                + ". Name Of Model - " + nameOfModel
                + ". Car Color - " + colorCar
                + ". Max speed - " + maxSpeed
                + ". Year Of Manufacture - " + yearOfManufacture;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getNameOfModel() {
        return nameOfModel;
    }

    public void setNameOfModel(String nameOfModel) {
        this.nameOfModel = nameOfModel;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
}

