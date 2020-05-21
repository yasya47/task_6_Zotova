package com.company;

import com.company.Movable.Car;
import com.company.Movable.Mark;
import com.company.Movable.PassengerCar;
import com.company.Movable.TruckCar;
import com.company.NotCar.Bike;
import com.company.NotCar.Horse;
import com.company.Stores.Store;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

       TruckCar truckMercedes = new TruckCar("Man",12547,"green",
               new GregorianCalendar(2000,Calendar.MAY,13),
               Mark.BMW,true,7,7000);
       PassengerCar passengerCar = new PassengerCar("minibus",25864,"red",
               new GregorianCalendar(2005,03,26), Mark.MERSEDES,false,18,2000);
        PassengerCar passengerMazya = new PassengerCar("Mazya",226864,"white",
                new GregorianCalendar(2002,12,27), Mark.MAZDA,true,5,5000);
        PassengerCar passengerBmw = new PassengerCar("Bmw",36254,"black",
                new GregorianCalendar(2016,02,07), Mark.BMW,true,5,10000);
       Horse horse = new Horse(true,"Plotva",2000);
       Bike bike = new Bike("Specialized",5,300);
       System.out.println(horse);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(truckMercedes);
        cars.add(passengerCar);
        cars.add(passengerMazya);
        cars.add(passengerBmw);
        System.out.println();

        Store<Car> store = new Store<Car>(cars);
        store.printProducts();
        store.purchase(2, 2000);

        System.out.println("\n Cash balance "+ store.getCashbox()+"\n");
        store.sell(5000, passengerBmw);
        store.printProducts();
        System.out.println(" \n Cash balance "+ store.getCashbox()+"\n");

    }

}
