package com.seed.study.Event;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class PaymentCompleted {
    public Long paymentId;
    public Date completionDate;
    // other fields as needed
}
