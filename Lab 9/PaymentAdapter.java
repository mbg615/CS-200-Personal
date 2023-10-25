package edu.ua.cs.cs200.lab8;

public class PaymentAdapter {
    void pay(int amount) {
        Paypal myPaypal = new Paypal();
        myPaypal.payViaPaypal(amount);
    }
}
