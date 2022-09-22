package com.example.hw2_2;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class mainHw22 {
    public static void main(String[] args) {
        //Задание 1,2
    System.out.println("Задание 1,2");
    Human maksim = new Human("Максим", 2022 - 35,"Минск","бренд-менеджер");
    //maksim.name = "Максим";
    //maksim.yearOfBirth = 2022 - 35;
    //maksim.town = "Минск";
    //maksim.job = "бренд-менеджер";
    maksim.hello();

    Human ann = new Human("Аня",2022 - 29, "Москва","методист образовательных программ");
    //ann.name = "Аня";
    //ann.yearOfBirth = 2022 - 29;
    //ann.town = "Москва";
    //ann.job = "методист образовательных программ";
    ann.hello();

    Human kate = new Human("Катя",2022 - 28, "Калининград","продакт-менеджер");
    //kate.name = "Катя";
    //kate.yearOfBirth = 2022 - 28;
    //kate.town = "Калининград";
    //kate.job = "продакт-менеджер";
    kate.hello();

    Human artem = new Human("Артём",2022 - 27, "Москва","директор по развитию бизнеса");
    //artem.name = "Артём";
    //artem.yearOfBirth = 2022 - 27;
    //artem.town = "Москва";
    //artem.job = "директор по развитию бизнеса";
    artem.hello();
        //Задание 3
    System.out.println("Задание 3");
    Car lada = new Car("Lada","Grande",1.7,"желтый",2015,"России");
    //lada.brand = "Lada";
    //lada.model = "Grande";
    //lada.color = "желтый";
    //lada.engineVolume = 1.7 ;
    //lada.productionCountry = "России";
    //lada.productionYear = 2015;
    lada.infoCar();

    Car audi = new Car("Audi","A8 50 L TDI quattro",3.0,"чёрный",2020,"Германии");
    //audi.brand = "Audi";
    //audi.model = "A8 50 L TDI quattro";
    //audi.color = "чёрный";
    //audi.engineVolume = 3.0 ;
    //audi.productionCountry = "Германии";
    //audi.productionYear = 2020;
    audi.infoCar();

    Car bmw = new Car("BMW","Z8",3.0,"чёрный",2021,"Германии");
    //bmw.brand = "BMW";
    //bmw.model = "Z8";
    //bmw.color = "чёрный";
    //bmw.engineVolume = 3.0 ;
    //bmw.productionCountry = "Германии";
    //bmw.productionYear = 2021;
    bmw.infoCar();

    Car kia = new Car("Kia","Sportage 4 поколение",2.4,"красный",2018,"Южной Корее");
    //kia.brand = "Kia";
    //kia.model = "Sportage 4 поколение";
    //kia.color = "красный";
    //kia.engineVolume = 2.4 ;
    //kia.productionCountry = "Южной Корее";
    //kia.productionYear = 2018;
    kia.infoCar();

    Car hyundai = new Car("Hyundai","Avante",1.6,"оранжевый",2016,"Южной Корее");
    //hyundai.brand = "Hyundai";
    //hyundai.model = "Avante";
    //hyundai.color = "оранжевый";
    //hyundai.engineVolume = 1.6 ;
    //hyundai.productionCountry = "Южной Корее";
    //hyundai.productionYear = 2016;
    hyundai.infoCar();

    }
}
