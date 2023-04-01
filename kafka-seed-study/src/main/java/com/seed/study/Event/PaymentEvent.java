package com.seed.study.Event;

import com.seed.study.domain.Payment;

public class PaymentEvent {
    private Payment payment;

    public PaymentEvent(Payment payment) {
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }
}