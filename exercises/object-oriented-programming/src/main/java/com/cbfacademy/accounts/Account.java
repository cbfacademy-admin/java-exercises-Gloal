package com.cbfacademy.accounts;

public class Account {
    private Double balance;
    private Integer accountNumber;

    public Account(Double balance, Integer accountNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(Double amount){
        this.balance += amount;
        System.out.println("Account "+ accountNumber +" has "+balance);

    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(Double amount){
        if(amount <0){
            amount = 0.0;
            System.out.println("You cannot withdraw a negative amount");

        }

        if(amount <= this.balance){
            this.balance -= amount;
           System.out.println("Account "+ accountNumber +" has "+balance);

        }
        else {
            System.out.println("Cannot withdraw");
        }
    }

}
