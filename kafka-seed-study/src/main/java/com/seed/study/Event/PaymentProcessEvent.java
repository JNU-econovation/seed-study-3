package com.seed.study.Event;


import com.seed.study.domain.Payment;
import com.seed.study.dto.Transaction;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class PaymentProcessEvent {
    private Payment payment;
    private Transaction transaction;
}
