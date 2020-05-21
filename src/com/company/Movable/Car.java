package com.company.Movable;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;


public abstract class Car implements Movable {
    private String name;
    private int serialNumber;
    private String colour;
    private Calendar calendar;
    private Mark mark;
    private Boolean go;
    private int price;

    public Car(String name, int serialNumber, String colour, Calendar calendar, Mark mark, Boolean go, int price) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.colour = colour;
        this.calendar = calendar;
        this.mark = mark;
        this.go = go;
        this.price = price;
    }

    public void move() {
        System.out.println("I can move ");
    }

    public abstract void start();

    public abstract void stop();

    public String convertToString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd:MM:yyyy");
        return simpleDateFormat.format(calendar.getTime());
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(" Car name - ").append(name)
                .append("\n SerialNumber - ").append(serialNumber)
                .append("\n colour - ").append(colour)
                .append("\n Calendar - ").append(convertToString())
                .append("\n Mark - ").append(mark)
                .append("\n State - ").append(go)
                .append("\n Price - ").append(price).append(" $");
        return str.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, serialNumber, colour, calendar, mark, go, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        return car.go == true &&
                name == car.name &&
                serialNumber == car.serialNumber &&
                colour.equals(car.colour) &&
                calendar.equals(car.calendar) &&
                mark == car.mark &&
                price == car.price;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }


    public int getSerialNumber() {

        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }


    public String getColour() {

        return colour;
    }

    public void setColour(String colour) {

        this.colour = colour;
    }


    public Date getCalendar() {
        return calendar.getTime();
    }

    public void setCalendar(Calendar calendar) {

        this.calendar = calendar;
    }

    public Mark getMark() {

        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }


    public String getIsGo() {
        if (go) {
            return "я еду!!!!";
        } else {
            return "я не еду(((((";
        }
    }

    public void setIsGo(Boolean isGo) {
        this.go = isGo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
