package com.cbfacademy.accounts;

public class CurrentAccount extends Account{
    private Double overdraftLimit;

    public CurrentAccount(Double overdraftLimit, Double balance, Integer accountNumber ){
        super(balance, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

//Override the Account withdraw method to inlcude overdraft
   // @Override 
    public void withdraw(Double amount){
        if(amount <0){
            System.out.println("You cannot withdraw a negative amount");
            amount = 0.00;
        }
        Double accbalance = getBalance();

        if(amount <= (accbalance + this.overdraftLimit)){
            accbalance -= amount;
            setBalance(accbalance);
            System.out.println("Current Account "+ getAccountNumber() +" has $"+getBalance());
        }
        else {
            System.out.println("Cannot withdraw: Not enough money");
        }
    }
}

