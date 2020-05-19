package com.company;

import java.util.Calendar;

public class TruckCar extends Car {
    private int carrying;

    public TruckCar(String name, int serialNumber, String colour, Calendar calendar, Mark mark, Boolean go, int carrying) {
        super(name, serialNumber, colour, calendar, mark, go);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(super.toString());
        str.append("\nCarrying - ").append(carrying);
        return str.toString();
    }


    public void speciesDefinition(int carrying) {
        if (carrying > 1 & carrying < 3)
            System.out.println("I am a small truck");
        if (carrying > 3 & carrying < 20)
            System.out.println("I'm a medium truck");
        else
            System.out.println("I am a big truck");
    }

    public void state(Boolean go) {
        if (go)
            System.out.println("I can go");
        else
            System.out.println("I can not go");
    }

    @Override
    public void start() {
        System.out.println("I went to import cargo");

    }

    @Override
    public void stop() {
        System.out.println("I arrived with a load, unload");
    }

        public int getCarrying () {
            return carrying;
        }
        public void setCarrying () {
            this.carrying = carrying;

    }
}
