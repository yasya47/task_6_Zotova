package com.company;

public class Horse implements Movable {

    private Boolean satiety;
    private String name;

public Horse(Boolean satiety,String name){
    this.satiety = satiety;
    this.name = name;
}

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Horse name is ").append(name)
        .append("\nHorse wants to eat and this ").append(satiety);
        return str.toString();
    }

    public void move(Boolean satiety){
        if (satiety)
            System.out.println("I can go");
        else
            System.out.println("I can not go, I want to eat");
    }
    @Override
    public void move() {
        System.out.println(" Igo - go");

    }
    public Boolean getSatiaty () {
        return satiety;
    }
    public void setSatiety () {
        this.satiety = satiety;

    }
    public String getName () {
        return name;
    }
    public void setName () {
        this.name = name;

    }
}
