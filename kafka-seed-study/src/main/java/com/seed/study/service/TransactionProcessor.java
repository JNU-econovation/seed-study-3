package com.seed.study.service;

import com.seed.study.domain.Payment;
import com.seed.study.domain.PaymentRepository;
import com.seed.study.domain.PaymentStatus;
import com.seed.study.dto.Transaction;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class TransactionProcessor {
    private final PaymentRepository paymentRepository;
    @Transactional
    public void processTransaction(Transaction transaction) {
        Payment payment = transaction.getPayment();
        payment.setPaymentStatus(PaymentStatus.COMPLETED);
        paymentRepository.save(payment);
    }
}
