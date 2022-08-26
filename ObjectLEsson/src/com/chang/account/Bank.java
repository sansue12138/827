package com.chang.account;


/**
 * @author liuchang
 * @Create 2022-08-20-20:40
 */
public class Bank {
    private int numberOfCustomer;
    private Customer[] customers;

    public Bank() {
    customers =new Customer[10];
    }

    public void addCustomer(String firstName, String lastName) {
        Customer customer =new Customer(lastName,firstName);
        customers[numberOfCustomer] = customer;

        this.numberOfCustomer++;
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public Customer getCustomers(int index) {
        if (index >= 0 && index < numberOfCustomer){
            return customers[index];
        }
            return null;//抛异常
    }
}
