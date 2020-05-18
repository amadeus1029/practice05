package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성

    public Account(String accountNo) {
        this.accountNo = accountNo;
    }


    //필요한 메소드 작성


    public String getAccountNo() {
        return accountNo;
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public void withdraw(int money) {
        if(balance<money) {
            System.out.println("잔액이 부족합니다");
        } else {
            this.balance -= money;
        }
    }

    public void showBalance() {
        System.out.println(this.balance);
    }

}
