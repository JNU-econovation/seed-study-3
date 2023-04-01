package com.seed.study.Event;

import java.util.Date;

public class PaymentCompleted {
    private final Long paymentId;
    private final Date completionDate;
    // other fields as needed

    public PaymentCompleted(Long paymentId, Date completionDate) {
        this.paymentId = paymentId;
        this.completionDate = completionDate;
    }
}
