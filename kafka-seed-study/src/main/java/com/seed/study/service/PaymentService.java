package com.seed.study.service;

import com.seed.study.Event.PaymentCompleted;
import com.seed.study.Event.PaymentEventPublisher;
import com.seed.study.domain.Payment;
import com.seed.study.domain.PaymentRepository;
import com.seed.study.domain.PaymentStatus;
import com.seed.study.dto.Transaction;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class PaymentService {
    private final PaymentEventPublisher eventPublisher;
    private final PaymentRepository paymentRepository;

    public void completePayment(Long paymentId) {
        Payment payment = paymentRepository.findById(paymentId).orElseThrow(() -> new IllegalArgumentException("존재하지 않는 개체입니다"));
        payment.setStatus(PaymentStatus.COMPLETED);
        paymentRepository.save(payment);
        PaymentCompleted paymentCompletedEvent = new PaymentCompleted(payment.getId(), new Date());
        eventPublisher.publishEvent(paymentCompletedEvent);
    }
    @Transactional
    public void processTransaction(Transaction transaction) {
        Payment payment = transaction.getPayment();
        payment.setStatus(PaymentStatus.COMPLETED);
        paymentRepository.save(payment);
    }
}
