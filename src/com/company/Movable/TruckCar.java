package com.company.Movable;

import java.util.Calendar;

public class TruckCar extends Car {
    private int carrying;

    public TruckCar(String name, int serialNumber, String colour, Calendar calendar, Mark mark, Boolean go, int carrying, int prise) {
        super(name, serialNumber, colour, calendar, mark, go,prise);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(super.toString());
        str.append("\n Carrying - ").append(carrying);
        return str.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        TruckCar truckCar = (TruckCar) obj;
        return carrying == truckCar.carrying;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
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
    class Trailer{
        private int trailerVolume;
        private String trailerColor;

        public Trailer(int trailerVolume,String trailerColor){
            this.trailerColor = trailerColor;
            this.trailerVolume = trailerVolume;
        }
        public int getTrailerVolume(){
            return trailerVolume;
        }
        public void setTrailerVolume(int trailerVolume){
            this.trailerVolume = trailerVolume;
        }
        public String getTrailerColor(){
            return trailerColor;
        }
        public void setTrailerColor(String trailerColor){
            this.trailerColor = trailerColor;
        }
    }
}
