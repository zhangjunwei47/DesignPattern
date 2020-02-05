package com.happy.designpattern.bridge;

public class Test {
    public static void main(String[] args) {
        System.out.println("桥接设计模式" );

        Bank abcBank = new ABCBank(new DepositAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();

        Bank icbcBank = new ICBCBank(new SavingAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();
    }
}
