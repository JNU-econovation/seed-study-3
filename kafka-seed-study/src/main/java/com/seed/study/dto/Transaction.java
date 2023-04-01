package com.seed.study.dto;

import com.seed.study.domain.Payment;
import com.seed.study.domain.PaymentStatus;
import lombok.Data;
import lombok.Setter;

@Data
@Setter
public class Transaction {
    private Payment payment;
    private PaymentStatus paymentStatus;
}
