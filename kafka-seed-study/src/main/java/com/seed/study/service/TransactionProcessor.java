package com.seed.study.service;

import com.seed.study.domain.Payment;
import com.seed.study.domain.PaymentRepository;
import com.seed.study.domain.PaymentStatus;
import com.seed.study.dto.Transaction;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TransactionProcessor {
    private PaymentRepository paymentRepository;

    @Transactional
    public void processTransaction(Transaction transaction) {
        Payment payment = transaction.getPayment();
        payment.setStatus(PaymentStatus.COMPLETED);
        paymentRepository.save(payment);
    }
}
