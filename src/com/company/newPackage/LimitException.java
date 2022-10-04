package com.company.newPackage;

import java.util.List;

public class LimitException extends Exception {
    BankAccount bankAccount = new BankAccount();
    double remainingAmount;

    public LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public  void getRemainingAmount(){
        System.out.println("Оставшееся количество денег: " + bankAccount.getAmount());
    }
}
