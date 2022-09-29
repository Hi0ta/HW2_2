package com.example.hw2_2;

import java.util.Arrays;

public class Flower {
    String flowerName;
    private String flowerColor;
    private String countryOfOrigin;
    private double cost;
    int lifeSpan;

    public Flower(String flowerName, String flowerColor, String countryOfOrigin, double cost, int lifeSpan) {
        if (flowerName == null || flowerName.isEmpty() || flowerName.isBlank()) {
            this.flowerName = "цветок";
        } else {
            this.flowerName = flowerName;
        }
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (countryOfOrigin == null || countryOfOrigin.isEmpty() || countryOfOrigin.isBlank()) {
            this.countryOfOrigin = "Россия";
        } else {
            this.countryOfOrigin = countryOfOrigin;
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }
    //конструктор в конструкторе (и последнее значение проставляется по умолчанию когда оно неизвестно)
    public Flower(String flowerName, String flowerColor, String countryOfOrigin, double cost){
        this(flowerName, flowerColor, countryOfOrigin, cost, 3);
    }

    public String getFlowerName() {return flowerName;}
    public String getFlowerColor() {return flowerColor;}
    public String getCountryOfOrigin() {return countryOfOrigin;}
    public double getCost() {return cost;}
    public int getLifeSpan() {return lifeSpan;}

    public void setFlowerName(String flowerName) {
        if (flowerName == null || flowerName.isEmpty() || flowerName.isBlank()) {
            this.flowerName = "цветок";
        } else {
            this.flowerName = flowerName;
        }
    }
    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }
    public void setCountryOfOrigin(String countryOfOrigin) {
        if (countryOfOrigin == null || countryOfOrigin.isEmpty() || countryOfOrigin.isBlank()) {
            this.countryOfOrigin = "Россия";
        } else {
            this.countryOfOrigin = countryOfOrigin;
        }
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }

    @Override
    public String toString() {
        return flowerName + ", " + flowerColor + ", " + countryOfOrigin + ", " + cost + ", " + lifeSpan;
    }
    void flower() {
        System.out.print("цветок: " + flowerName +
                         "; цвет: " + flowerColor +
                         "; страна происхождения: " + countryOfOrigin +
                         "; срок стояния цветка (дней): " + lifeSpan);
        System.out.printf("; цена за 1 шт: %.2f руб.", cost);
        System.out.println();
    }

  }
