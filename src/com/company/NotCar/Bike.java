package com.company.NotCar;

import com.company.Movable.Movable;

public class Bike implements Movable {

    private String mark;
    private int numberSpeeds;
    private int price;

    public Bike(String mark, int numberSpeeds,int price) {
        this.mark = mark;
        this.numberSpeeds = numberSpeeds;
        this.price = price;
    }

    public void fast (int numberSpeeds){
        if (numberSpeeds>3)
            System.out.println("This bike is fast");
        else
            System.out.println("This bike is slow");
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Brand of this bike ").append(mark)
                .append("\nThis bike has  ").append(numberSpeeds).append(" speeds ")
        .append("\nPrise ").append(price).append("$");
        return str.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void move() {
        System.out.println("need to pedal");
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getNumberSpeeds() {
        return numberSpeeds;
    }

    public void setNumberSpeeds(int numberSpeeds) {
        this.numberSpeeds = numberSpeeds;
    }
    public int getPrice() {
        return price ;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    class Lamp{
        private boolean isLamp;
        Lamp (boolean isLamp){
            this.isLamp = isLamp;
        }
        public boolean getIsLamp(){
            return isLamp;
        }
        public void setIsLamp(boolean isLamp){
            this.isLamp = isLamp;
        }
    }
}