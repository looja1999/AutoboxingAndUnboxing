package com.looja.tuladhar;

import java.util.ArrayList;

public class Bank {

    //fields
    private ArrayList<Branch> branch = new ArrayList<Branch>();
    private String name;

    //constructor
    public Bank(String name){
        this.name = name;
    }

    //methods
    public void createNewBranch(String branchName){
        branch.add(new Branch(branchName));
    }

    public void getBranch(){
        for(int i = 0; i<branch.size(); i++){
            System.out.println("Branch " + (i + 1) + " : " + branch.get(i).getName());
        }
    }

    public void addCustomer(String customerName, String branchName, double transactions){

        boolean condition = false;

        for(int i = 0; i<branch.size(); i++){
            if(branch.get(i).getName() == branchName){
                condition = true;
                branch.get(i).newCustomer(customerName, transactions);
            }
        }

        if(!condition) System.out.println("Please, enter valid branch name");
    }


    public void getCustomers(String branchName){

        boolean condition = false;

        for(int i = 0; i<branch.size(); i++) {
            if (branch.get(i).getName() == branchName) {
                System.out.println("Customers of Branch :" + branchName);
                condition = true;
                branch.get(i).getCustomers();
            }
        }

        if(!condition) System.out.println("Please, enter valid branch name");
    }

    public void addCustomerTransaction(String customerName, double transaction){
        
        for(int i = 0; i<branch.size(); i++){
            for(int j = 0; j<branch.get(i).customer.size(); j++){
                if(branch.get(i).customer.get(j).getName() == customerName){
                    System.out.println("New transaction to " + customerName + " of $" + transaction );
                    branch.get(i).customer.get(j).addTransaction(transaction);
                }
            }
        }
    }
}
