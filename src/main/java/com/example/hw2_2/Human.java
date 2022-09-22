package com.example.hw2_2;

public class Human {
    String name;
    int yearOfBirth;
    String town;
    String job;

    public Human() {
        this("информация не указана", 0, "информация не указана", "информация не указана");
    }
    public Human(String name, int yearOfBirth, String town, String job) {
        if (name == null) {
            this.name = "информация не указана";
        } else {
            this.name = name;
        }
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (town == null) {
            this.town = "информация не указана";
        } else {
            this.town = town;
        }
        if (job == null) {
            this.job = "информация не указана";
        } else {
            this.job = job;
        }
    }
    void hello() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родилась(ся) в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!");
    }
}
