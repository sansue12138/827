package com.chang.account;

/**
 * @author liuchang
 * @Create 2022-08-20-20:19
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank =new Bank();
        bank.addCustomer("Smith","Jane");

        bank.getCustomers(0).setAccount(new Account(2000));
        bank.getCustomers(0).getAccount().withdraw(500);
        bank.getCustomers(0).getAccount().deposit(100);
        double balance = bank.getCustomers(0).getAccount().getBalance();
        System.out.println("客户："+bank.getCustomers(0).getFirstName()+ bank.getCustomers(0).getLastName()+"的账户余额为："+balance);
        System.out.println("****************************");

        bank.addCustomer("万里","杨");
        System.out.println("银行客户的个数为："+bank.getNumberOfCustomer());
    }



}
