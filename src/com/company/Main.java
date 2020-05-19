package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

       TruckCar truck = new TruckCar("Man",12547,"green",
               new GregorianCalendar(2000,Calendar.MAY,13),
               Mark.BMB,true,7);
       PassengerCar passengerCar = new PassengerCar("minibus",25864,"red",
               new GregorianCalendar(2005,03,26),Mark.MERSEDES,true,18);
       Horse horse = new Horse(true,"Plotka");
       Bike bike = new Bike("Specialized",5);
        System.out.println(bike);

    }
}
