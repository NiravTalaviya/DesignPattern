package org.example.adapter;

public class StripeClientClassAdapter  extends StripeClient implements PaymentProcessor {
    @Override
    public boolean processPayment() {
        System.out.println("Calling Stripe make payment from Class adapter");
        return this.makePayment();
    }
}
