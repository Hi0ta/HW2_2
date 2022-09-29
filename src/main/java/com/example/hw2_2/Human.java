package com.example.hw2_2;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;

public class Human {
    String name;
    private int yearOfBirth;
    private int age;
    private String town;
    String job;

    public Human(String name, int age, String town, String job) {
        if (name == null || town.isEmpty() || town.isBlank()) {
            this.name = "информация не указана";
        } else {
            this.name = name;
        }
        if (age <= 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = LocalDate.now().getYear() - age;
        }
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = "информация не указана";
        } else {
            this.town = town;
        }
        if (job == null || town.isEmpty() || town.isBlank()) {
            this.job = "информация не указана";
        } else {
            this.job = job;
        }
    }
    public int getAge() {return yearOfBirth;}
    public void setAge(int age) {
        if (age <= 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = LocalDate.now().getYear() - age;
        }
    }
    public String getTown() {return town;}
    public void setTown(String town) {
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = "информация не указана";
        } else {
            this.town = town;
        }
    }
    void hello() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родилась(ся) в " + yearOfBirth +" году. Я работаю на должности: " + job + ". Будем знакомы!");
    }
}
