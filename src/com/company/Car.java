package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;


public abstract class Car implements Movable {
    private String name;
    private int serialNumber;
    private String colour;
    private Calendar calendar;
    private Mark mark; // enum
    private Boolean go; //?????

    public Car(String name, int serialNumber, String colour, Calendar calendar, Mark mark, Boolean go) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.colour = colour;
        this.calendar = calendar;
        this.mark = mark;
        this.go = go;
    }

    public void move() {
        System.out.println("I can move ");
    }

    public abstract void start();

    public abstract void stop();

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Car brand - ").append(mark).append(", colour - ").append(colour);
        return str.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, serialNumber, colour, go);
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
                mark == car.mark &&
                serialNumber == car.serialNumber &&
                colour.equals(car.colour) &&
                calendar.equals(car.calendar);
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


    public String getCalendar() {
        Date date = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(date);
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


    public Boolean getIsGo() {
        return go;
    }

    public void setIsGo(Boolean isGo) {
        this.go = isGo;
    }
}
