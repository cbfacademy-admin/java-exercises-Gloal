package com.cbfacademy.accounts;

public class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount(Double balance, Double interestRate, Integer accountNumber){
        super(balance, accountNumber);
        this.interestRate = interestRate; 
    }


    public void addInterest(){

        double interest = (interestRate/100) * getBalance();
        System.out.println("Interest added: $"+interest);
        this.deposit(interest);

    }

}
