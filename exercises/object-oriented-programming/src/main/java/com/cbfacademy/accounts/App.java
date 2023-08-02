package com.cbfacademy.accounts;

public class App {

    public static void main (String [] args){
        Account acc = new Account(99.9, 90785645);
        System.out.println(acc.getBalance());
        acc.withdraw(-89.9);
        acc.deposit(9.85);
        
        
        CurrentAccount acc2 = new CurrentAccount(100.0, 30.0, 1234567);
        acc2.getBalance();
        acc2.withdraw(56.0);
        acc2.deposit(99.9);
        acc2.withdraw(56.0);
        acc2.withdraw(56.0);
        acc2.withdraw(-56.0);
        acc2.deposit(-90.75);
        acc2.withdraw(99.09);

 
        SavingsAccount acc3 = new SavingsAccount(890.00, 4.5, 234548173);
        System.out.println(acc3.getBalance());
        acc3.addInterest();
        
    }
    
}
