package com.company.Movable;

public enum Mark {
    MERSEDES("Mercedes-Benz", "Germany", 1883),
    BMW("Bayerische Motoren Werke AG", "Germany", 1916),
    MAZDA("Mazda Motor Corporation", "Japan", 1920),
    TESLA("Tesla Motors", "USA", 2003),
    LADA("AvtoVAZ", "Russia", 1970);

    private String name;
    private String country;
    private int yearOfFoundation;

    private Mark(String name, String country, int yearOfFoundation) {
        this.name = name;
        this.country = country;
        this.yearOfFoundation = yearOfFoundation;
    }

    public String getName() {
        return this.name;
    }

   /* public void setName(String name) {
        this.name = name;

    }
*/
    public String getCountry() {
        return this.country;
    }

    public void setCountry() {
        this.country = country;
    }

    public int getYearOfFoundation() {
        return this.yearOfFoundation;
    }

    public void setYearOfFoundation() {
        this.yearOfFoundation = yearOfFoundation;
    }
}

