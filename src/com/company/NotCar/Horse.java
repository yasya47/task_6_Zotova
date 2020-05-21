package com.company.NotCar;

import com.company.Movable.Movable;

public class Horse implements Movable {

    private Boolean satiety;
    private String name;
    private int price;

    public Horse(Boolean satiety, String name, int price) {
        this.satiety = satiety;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Horse name is ").append(name)
                .append("\nHorse wants to eat and this ").append(satiety)
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

    public void move(Boolean satiety) {
        if (satiety)
            System.out.println("I can go");
        else
            System.out.println("I can not go, I want to eat");
    }

    @Override
    public void move() {
        System.out.println(" Igo - go");

    }

    public Boolean getSatiaty() {
        return satiety;
    }

    public void setSatiety() {
        this.satiety = satiety;

    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    class Tail {
        private int lengthTail;

        Tail(int lengthTail) {
            this.lengthTail = lengthTail;
        }

        public int getLengthTail() {
            return lengthTail;
        }

        public void setLengthTail(int lengthTail) {
            this.lengthTail = lengthTail;
        }
    }
}