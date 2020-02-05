package com.happy.designpattern.bridge;

public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        account.openAccount();
        System.out.println("打开一个工商银行账号");
        return account;
    }

}
