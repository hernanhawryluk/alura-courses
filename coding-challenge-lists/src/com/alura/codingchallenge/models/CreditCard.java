package com.alura.codingchallenge.models;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit;
    private double balance;
    private List<Purchase> listOfPurchases;

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.listOfPurchases = new ArrayList<>();
    }

    public boolean buyAttempt(Purchase purchase) {
        if (this.balance >= purchase.getValue()) {
            this.balance -= purchase.getValue();
            this.listOfPurchases.add(purchase);
            return true;
        }
        return false;
    }

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public List<Purchase> getListOfPurchases() {
        return listOfPurchases;
    }
}
