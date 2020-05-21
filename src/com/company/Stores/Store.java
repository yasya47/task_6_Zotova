package com.company.Stores;

import com.company.Movable.Car;

import java.util.ArrayList;

public class Store <T extends Car> {
    private int cashbox = 20000;
    private ArrayList <T> items;


public Store (ArrayList <T> items){
    this.items = items;
}
public void printProducts() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(i + 1 +". "+ items.get(i).toString());
        }

    }
public void purchase (int numberItem,int priceSell){
    if (priceSell >= items.get(numberItem - 1).getPrice()) {
        cashbox += items.get(numberItem - 1).getPrice();
          items.remove(numberItem - 1);
    } else {
        System.out.println("Not enough money");
    }
}
public void sell(int purchasePrice,T itemNew){
    if (purchasePrice > itemNew.getPrice()) {
        System.out.println("It's too expensive");
    } else if (purchasePrice > cashbox) {
        System.out.println("Not enough money at the checkout");
    } else {
        cashbox -= purchasePrice;
        items.add(itemNew);

    }
}

    public int getCashbox(){
        return cashbox;
    }
    public void setCashbox(int cashbox){
        this.cashbox = cashbox;
    }

}
