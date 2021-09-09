package com.looja.tuladhar;

import java.util.ArrayList;

public class Customer {

    //fields
    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    //constructor
    public Customer(String name, double transactions){
        this.name = name;
        this.transactions.add(Double.valueOf(transactions));
    }

    //getters

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction){
        transactions.add(transaction);
    }

    public double totalTransaction(){
        double sum = 0;
        for(int i = 0; i<transactions.size(); i++){
            sum += transactions.get(i);
        }
        return sum;
    }
}
