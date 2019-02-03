package com.eftekherhusain;

public class Main {

    public static void main(String[] args) {

        BankAccount bobsAccount = new BankAccount();
        bobsAccount.withdrawal(100);

        bobsAccount.deposit(50);
        bobsAccount.withdrawal(100);
        bobsAccount.deposit(51);
        bobsAccount.withdrawal(100);

        VipCustomer vc1 = new VipCustomer();
        System.out.println("Vip name: " + vc1.getName());
        VipCustomer vc2 = new VipCustomer("Tim", "vc@td.com");
        System.out.println("Vip name: " + vc2.getName());
        VipCustomer vc3 = new VipCustomer("Bob", "vc@td.com", "100000");
        System.out.println("Vip name: " + vc3.getName());




    }
}
