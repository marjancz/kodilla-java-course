package com.marjancz.module_01;

abstract class Bank {

    protected abstract void askVerifing();

    protected abstract void statusAccountVerifing();

    protected abstract void confirmation();

    public void runBank() {
        this.askVerifing();
        this.statusAccountVerifing();
        this.confirmation();
    }
}

class ATM extends Bank {

    protected void askVerifing() {
        System.out.println("Your Bank verifies the ability to withdraw cash");
    }

    protected void statusAccountVerifing() {
        System.out.println("Checking your account status...");
    }

    protected void confirmation() {
        System.out.println("You have enough amount of cash on your acccount.");
    }

    public void insertCard() {
        System.out.println("Please insert your card...");
    }

    public void codePIN() {
        System.out.println("Please enter the PIN code: ");
    }

    public void enterTheAmount() {
        System.out.println("Please enter the amount: ");
    }

    public void cashOut() {
        System.out.println("Your money is being paid. Please take the money!");
    }
    public void thank() {
        System.out.println("Your transaction has been accomplieshed! Thank You for using our ATM");
    }

    public void runATM1() {
        this.insertCard();
        this.codePIN();
        this.enterTheAmount();
    }

    public void runATM2() {
        this.cashOut();
        this.thank();
    }
}

class App14 {
    public static void main (String[] args) {

        ATM atm = new ATM();
        atm.runATM1();
        atm.runBank();
        atm.runATM2();
    }
}
