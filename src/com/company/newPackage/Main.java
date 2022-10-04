package com.company.newPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * a) Написать класс проверяемого исключения LimitException, с конструктором LimitException(String message,
 * double remainingAmount) и методом getRemainingAmount().
 * b) Написать класс BankAccount с 1 полем double amount - остаток на счете и методами getAmount() -
 * возвращает текущий остаток на счете, deposit(double sum) - положить деньги на счет, withDraw(int sum) -
 * снимает указанную сумму со счета.
 * c) Также метод withDraw() может сгенерировать исключение в том случае если запрашиваемая сумма на снятие
 * больше чем остаток денег на счете.
 * d) Написать Main класс где бы создавался счет клиента. Положить 20 000 сом на счет.
 * e) Затем попытаться снять через бесконечный цикл, каждую итерацию по 6000 сом, при этом отлавливать
 * исключение LimitException и при возникновении такого исключения снимать только ту сумму, которая осталась
 * на счете и завершать бесконечный цикл
 */
public class Main {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>(List.of(1,2,2,3,1,2,2,1,2,5,7,9,1,12,8,11,16,17,20));
//        list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

       // List<Integer> list2 = list.stream().distinct().collect(Collectors.toList());

        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.getAmount());
        System.out.println("-------------------------------------");
        bankAccount.deposit(20000);
        bankAccount.withDraw(6000);
        System.out.println(bankAccount.getAmount());
        System.out.println("-------------------------------------");
        bankAccount.withDraw(6000);
        System.out.println(bankAccount.getAmount());
        System.out.println("-------------------------------------");
        bankAccount.withDraw(6000);
        System.out.println(bankAccount.getAmount());
        System.out.println("-------------------------------------");
        bankAccount.withDraw(6000);
        System.out.println(bankAccount.getAmount());
        System.out.println("-------------------------------------");



    }
}
