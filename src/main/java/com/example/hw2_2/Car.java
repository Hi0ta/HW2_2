package com.example.hw2_2;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car() {
        brand = "default";
        model = "default";
        engineVolume = 1.5;
        color = "белый";
        productionYear = 2000;
        productionCountry = "default";
    }
    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
    }

    void infoCar() {
        System.out.println(brand + " " + model + " " + productionYear + " года выпуска, сборка в " + productionCountry + ", цвет кузова: " + color + ", объем двигателя: " + engineVolume + " литра.");
    }
}
