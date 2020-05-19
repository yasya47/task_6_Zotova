package com.company;

import java.util.Calendar;

public class PassengerCar extends Car {
    private int numberPassengers;

    public PassengerCar(String name, int serialNumber, String colour, Calendar calendar, Mark mark, Boolean go, int numberPassengers) {
        super(name, serialNumber, colour, calendar, mark, go);
        this.numberPassengers = numberPassengers;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(super.toString());
        str.append("\nNumber of Passengers - ").append(numberPassengers);
        return str.toString();

    }

    public void kinCar(int numberPassengers) {
        if (numberPassengers > 1 & numberPassengers < 5)
            System.out.println("I'm an ordinary car");
        if (numberPassengers > 5 & numberPassengers < 15)
            System.out.println("I'm an ordinary car");
        else
            System.out.println("i am a bus");
    }

    public void direction(int numberPassengers) {
        if (numberPassengers > 1)
            System.out.println("I'm going where they say");
        else
            System.out.println("I'm going where they say");
    }

    @Override
    public void start() {
        System.out.println("I went to deliver people");
    }

    @Override
    public void stop() {
        System.out.println("I finished delivering people");

    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }
}
