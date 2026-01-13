package org.example.adapter;

public class StripeClientObjectAdapter implements PaymentProcessor {
    StripeClient stripeClient;

    public StripeClientObjectAdapter(StripeClient stripeClient) {
        this.stripeClient = stripeClient;
    }

    @Override
    public boolean processPayment() {
        System.out.println("From Object adapter, calling stripe client to make payment.");
        return this.stripeClient.makePayment();
    }
}
