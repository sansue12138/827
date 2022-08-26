package com.chang.account;

/**
 * @author liuchang
 * @Create 2022-08-20-20:08
 */
public class Account {
    private double balance;

    //构造器
    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    //取钱
    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("对不起，余额不足");
            return;
        }
        balance -= amount;
        System.out.println("成功取出：" + amount);
    }

    //存钱
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("成功存入："+amount);
        }
    }
}
