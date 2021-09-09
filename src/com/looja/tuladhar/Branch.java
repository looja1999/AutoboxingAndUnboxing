package com.looja.tuladhar;

import java.util.ArrayList;

public class Branch {

    //fields
    private String name;
    ArrayList<Customer> customer = new ArrayList<Customer>();

    //constructors
    public Branch(String name){
        this.name = name;
    }

    //getters
    public String getName() {
        return name;
    }

    public void newCustomer(String customerName, double transactions){

        boolean contains = false;

        //validation check to see if the customer exists
        for(int i = 0; i<customer.size(); i++){
            if(customer.get(i).getName() == customerName) contains = true;
        }

        if(!contains) {
            customer.add(new Customer(customerName, transactions));
            System.out.println("Customer " + customerName + " created.");
        } else {
            System.out.println("Customer exists ");
        };

    }

    public void getCustomers(){
        for(int i = 0; i<customer.size(); i++){

            System.out.println("Total Transaction : " + customer.get(i).totalTransaction());

            for(int j = 0; j<customer.get(i).getTransactions().size(); j++){
                System.out.println("Transaction " + (i + 1) + " : " + customer.get(i).getTransactions().get(j));
            }

        }
    }
}
