package org.example.adapter;

public class InternalPaymentSystem {
    public boolean processPayment(PaymentProcessor paymentProcessor) {
        System.out.println("Internal Payment system processing payment");
        return paymentProcessor.processPayment();
    }
}
