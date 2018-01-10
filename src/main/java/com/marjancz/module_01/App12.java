package com.marjancz.module_01;

interface ATM1 {

    public void takingCashFromAtm(int takeAmount);
    void paymentToAtm(int paymentAmount);
    default void connect() {
        System.out.println("A connection with your Bank has been established");
    }
    static String endConnection() {
        return "Your transaction has been done! Thank You for using our ATM";
    }
}

class ATMImpl implements ATM1 {

    public void takingCashFromAtm(int takeAmount) {
        System.out.println("You want to withdraw $:" + " " + takeAmount);
    }
    public void paymentToAtm(int paymentAmount) {
        System.out.println("You want to payment to account $:" + " " +paymentAmount);
    }
}

class App12 {

    public static void main(String[] args) throws java.lang.Exception {

        int takeAmount = 200;
        int paymentAmount = 500;

        ATMImpl atm = new ATMImpl();
        atm.connect();
        atm.takingCashFromAtm(takeAmount);
        atm.paymentToAtm(paymentAmount);
        System.out.println(ATM1.endConnection());
    }
}
