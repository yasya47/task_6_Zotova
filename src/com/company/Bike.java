package com.company;

public class Bike implements Movable {

    private String mark;
    private int numberSpeeds;

    public Bike(String mark, int numberSpeeds) {
        this.mark = mark;
        this.numberSpeeds = numberSpeeds;
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
                .append("\nThis bike has  ").append(numberSpeeds).append(" speeds ");
        return str.toString();
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
}