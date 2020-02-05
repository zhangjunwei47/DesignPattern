package com.happy.designpattern.bridge;

public class ABCBank extends Bank {

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        account.openAccount();
        System.out.println("打开一个农业银行账号");
        return account;
    }


}
