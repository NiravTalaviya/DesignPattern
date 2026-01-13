package org.example.adapater;

import org.example.adapter.InternalPaymentSystem;
import org.example.adapter.StripeClient;
import org.example.adapter.StripeClientClassAdapter;
import org.example.adapter.StripeClientObjectAdapter;
import org.junit.jupiter.api.Test;

class FunctionalTest {
    @Test
    public void happyCase_ClassAdapter() {
        StripeClientClassAdapter stripeClientClassAdapter = new StripeClientClassAdapter();
        InternalPaymentSystem internalPaymentSystem = new InternalPaymentSystem();
        internalPaymentSystem.processPayment(stripeClientClassAdapter);
    }

    @Test
    public void happyCase_ObjectAdapter() {
        StripeClient stripeClient = new StripeClient();
        StripeClientObjectAdapter stripeClientObjectAdapter = new StripeClientObjectAdapter(stripeClient);
        InternalPaymentSystem internalPaymentSystem = new InternalPaymentSystem();
        internalPaymentSystem.processPayment(stripeClientObjectAdapter);
    }
}
