package com.looja.tuladhar;

public class Main {

    public static void main(String[] args) {
        Bank bok = new Bank("Bank of Kathmandu");

        //adding branch in bok
        bok.createNewBranch("kamladi");
        bok.createNewBranch("Lalitpur");
        bok.createNewBranch("Bhaktapur");

        //add new customer to the Kamladi
        bok.addCustomer("Looja", "kamladi", 1000);
        bok.addCustomer("Tuladhar", "Lalitpur", 1000);


        //getting branch
        bok.getBranch();

        //getting customers at branch kamladi
        System.out.println();
        bok.getCustomers("kamladi");

        //getting customers at branch Lalitpur
        System.out.println();
        bok.getCustomers("Lalitpur");

        //getting customers at branch Bhaktapur
        System.out.println();
        bok.getCustomers("Bhaktapur");

        //add transaction
        System.out.println();
        bok.addCustomerTransaction("Looja", 1000);
        bok.getCustomers("kamladi");

        //add customer
        System.out.println();
        bok.addCustomer("Ratna", "kamladi", 0);

    }

}
