package com.company.Movable;

import java.util.Calendar;

public class PassengerCar extends Car {
    private int numberPassengers;

    public PassengerCar(String name, int serialNumber, String colour, Calendar calendar, Mark mark, Boolean go, int numberPassengers, int price) {
        super(name, serialNumber, colour, calendar, mark, go,price);
        this.numberPassengers = numberPassengers;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(super.toString());
        str.append("\n Number of Passengers - ").append(numberPassengers);
        return str.toString();
    }

    @Override
    public boolean equals(Object obj) { if (obj == this) {
        return true;
    }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        PassengerCar passengerCar = (PassengerCar) obj;
        return numberPassengers == passengerCar.numberPassengers;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
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
    class Seat{
        private int numberSeat;
        private boolean emptyPlace;
        Seat (int numberSeat,boolean emptyPlace){
            this.numberSeat = numberSeat;
            this.emptyPlace = emptyPlace;
        }
        public int getNumberSeat(){
            return numberSeat;
        }
        public void setNumberSeat(int numberSeat){
            this.numberSeat = numberSeat;
        }
        public boolean getEmptyPlace(){
            return emptyPlace;
        }
        public void setEmptyPlace(boolean emptyPlace){
            this.emptyPlace = emptyPlace;
        }
    }
}
