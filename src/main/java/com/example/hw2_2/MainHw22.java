package com.example.hw2_2;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import transport.Car;

import java.time.LocalDate;
import java.util.Arrays;



@SpringBootApplication
public class MainHw22 {
    private static Flower[] bouquet = new Flower[0];

    public static Flower[] addFlower(Flower flower) {
        bouquet = Arrays.copyOf(bouquet, bouquet.length + 1);
        for (int i = 0; i < bouquet.length; i++) {
            if (bouquet[i] == null) {
                bouquet[i] = flower;
            }
        }
        return bouquet;
    }

    private static int getLifeSpanMin(Flower[] bouquet) {
        int lifeSpanMin = bouquet[0].lifeSpan;
        for (int index = 1; index < bouquet.length; index++) {
            if (bouquet[index].lifeSpan < lifeSpanMin) {
                lifeSpanMin = bouquet[index].lifeSpan;
            }
        }
        return lifeSpanMin;
    }

    private static double getCostBouquet(Flower[] bouquet) {
        double costBouquet = 0.00;
        for (int m = 0; m < bouquet.length; m++) {
            costBouquet += bouquet[m].getCost();
        }
        costBouquet = costBouquet * 1.1;
        return costBouquet;
    }

    // System.out.println("Список ФИО сотрудников:");
    //   for (int m = 0; m < arrList.length; m++) {
    // System.out.println(arrList[m].getFullName());
    //}
    private static void printBouquet(Flower[] bouquet) {
        System.out.print("Состав букета: ");
        for (int m = 0; m < bouquet.length; m++) {
            System.out.print("" + bouquet[m].getFlowerName() + ", ");
        }
        System.out.println();
        System.out.printf("стоимость букета: %.2f руб.", getCostBouquet(bouquet));
        System.out.println(", срок стояния букета (дней): " + getLifeSpanMin(bouquet));
    }

    public static void main(String[] args) {

        Human maksim = new Human("Максим", 35, "Минск", "бренд-менеджер");
        //maksim.name = "Максим";
        //maksim.yearOfBirth = 2022 - 35;
        //maksim.town = "Минск";
        //maksim.job = "бренд-менеджер";
        maksim.hello();

        Human ann = new Human("Аня", 29, "Москва", "методист образовательных программ");
        //ann.name = "Аня";
        //ann.yearOfBirth = 2022 - 29;
        //ann.town = "Москва";
        //ann.job = "методист образовательных программ";
        ann.hello();

        Human kate = new Human("Катя", 28, "Калининград", "продакт-менеджер");
        //kate.name = "Катя";
        //kate.yearOfBirth = 2022 - 28;
        //kate.town = "Калининград";
        //kate.job = "продакт-менеджер";
        kate.hello();

        Human artem = new Human("Артём", 27, "Москва", "директор по развитию бизнеса");
        //artem.name = "Артём";
        //artem.yearOfBirth = 2022 - 27;
        //artem.town = "Москва";
        //artem.job = "директор по развитию бизнеса";
        artem.hello();

        Human vladimir = new Human("Владимир", 21, "Казань", "нигде не работает");
        vladimir.hello();
        System.out.println();

        Flower rozaOrdinary = new Flower("роза обыкновенная", null, "Голландия", 35.59);
        rozaOrdinary.flower();
        Flower khrizantema = new Flower("хризантема", null, null, 15);
        khrizantema.lifeSpan = 5;
        khrizantema.flower();
        Flower pion = new Flower("пион", null, "Англия", 69.9, 1);
        pion.flower();
        Flower gipsofila = new Flower("гипсофила", null, "Турция", 19.5, 10);
        gipsofila.flower();

        System.out.println();

        addFlower(rozaOrdinary);
        addFlower(rozaOrdinary);
        addFlower(rozaOrdinary);
        addFlower(khrizantema);
        addFlower(khrizantema);
        addFlower(khrizantema);
        addFlower(khrizantema);
        addFlower(khrizantema);
        addFlower(gipsofila);
        printBouquet(bouquet);


    System.out.println();
    Car lada = new Car("Lada","Grande",1.7,"желтый",2015,"России", null, "седан", "Л123ТС159", 5, "summer", new Car.Key(false, false), new Car.Insurance(LocalDate.of(2021, 6, 30), 4500.00, "123658974"));
    //lada.brand = "Lada";
    //lada.model = "Grande";
    //lada.color = "желтый";
    //lada.engineVolume = 1.7 ;
    //lada.productionCountry = "России";
    //lada.productionYear = 2015;
    lada.infoCar();

    Car audi = new Car("Audi","A8 50 L TDI quattro",3.0,"чёрный",2020,"Германии", "tiptronic", "седан", "К707ТТ178", 5, "winter", new Car.Key(true, true), new Car.Insurance(LocalDate.of(2023, 7, 28), 10000.00, "389516742"));
    //audi.brand = "Audi";
    //audi.model = "A8 50 L TDI quattro";
    //audi.color = "чёрный";
    //audi.engineVolume = 3.0 ;
    //audi.productionCountry = "Германии";
    //audi.productionYear = 2020;
    audi.infoCar();

    Car bmw = new Car("BMW","Z8",3.0,"чёрный",2021,"Германии", "manual", "кабриолет","К333ВУ777", 2, "summer", new Car.Key(true,true), new Car.Insurance(LocalDate.of(2023, 3, 8), 12000.00, "568197634"));
    //bmw.brand = "BMW";
    //bmw.model = "Z8";
    //bmw.color = "чёрный";
    //bmw.engineVolume = 3.0 ;
    //bmw.productionCountry = "Германии";
    //bmw.productionYear = 2021;
    bmw.infoCar();

    Car kia = new Car("Kia","Sportage 4 поколение",2.4,"красный",2018,"Южной Корее", "automatic", "кроссовер","С333ТС777", 5, "winter", new Car.Key(true,false), new Car.Insurance(LocalDate.of(2023, 2, 25), 8000.00, "782946351"));
    //kia.brand = "Kia";
    //kia.model = "Sportage 4 поколение";
    //kia.color = "красный";
    //kia.engineVolume = 2.4 ;
    //kia.productionCountry = "Южной Корее";
    //kia.productionYear = 2018;
    kia.infoCar();

    Car hyundai = new Car("Hyundai","Avante",1.6,"оранжевый",2016,"Южной Корее", "robot", "седан", "У231ПТ133", 5, "summer", new Car.Key(true,false), new Car.Insurance(LocalDate.of(2022, 9, 20), 5000.00, "68992362"));
    //hyundai.brand = "Hyundai";
    //hyundai.model = "Avante";
    //hyundai.color = "оранжевый";
    //hyundai.engineVolume = 1.6 ;
    //hyundai.productionCountry = "Южной Корее";
    //hyundai.productionYear = 2016;
    hyundai.infoCar();
    System.out.println();
    lada.infoSignal();
    audi.infoSignal();
    bmw.infoSignal();
    kia.infoSignal();
    hyundai.infoSignal();

    lada.getInsurance().checkValidityOfInsurancel();
    audi.getInsurance().checkValidityOfInsurancel();
    bmw.getInsurance().checkValidityOfInsurancel();
    kia.getInsurance().checkValidityOfInsurancel();
    hyundai.getInsurance().checkValidityOfInsurancel();

    }
}
