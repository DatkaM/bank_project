package com.company.newPackage;

//* b) Написать класс BankAccount с 1 полем double amount - остаток на счете и методами getAmount() -
//     возвращает текущий остаток на счете, deposit(double sum) - положить деньги на счет,
//     withDraw(int sum) - снимает указанную сумму со счета.
public class BankAccount {

    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public BankAccount() {
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        System.out.print("Сумма денег на вашем счету: ");
        return this.amount;
    }

    public void deposit(double sum) {
        System.out.println("Сумма денег, которую вы внесли на свой счет, составляет: " + sum);
        this.amount += sum;
    }

    public void withDraw(int sum) {
//        while (true) {
        try {
            if (sum > this.amount) {
//                sum = (int) this.amount;
                System.out.println("it's exception output");
                throw new LimitException("Недостаточно средств на счете: ",this.amount);
            }
            this.amount-= sum;
            System.out.println("Вы со счета сняли: " + sum);
        } catch (LimitException e) {
            System.out.println(e.getMessage());
//                e.getRemainingAmount();
        }
    }
//    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "amount=" + amount +
                '}';
    }
}
