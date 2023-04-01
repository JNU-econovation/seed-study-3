package com.seed.study.Event;

import com.seed.study.dto.Transaction;
import com.seed.study.service.TransactionProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;


@RequiredArgsConstructor
public class PaymentEventListener {
    private final TransactionProcessor transactionProcessor;

    @Bean
    public IntegrationFlow handlePaymentProcessedEvent() {
        return IntegrationFlows.from("paymentProcessedChannel")
                .handle(event -> {
                    PaymentProcessedEvent paymentProcessedEvent = (PaymentProcessedEvent) event.getPayload();
                    Transaction transaction = paymentProcessedEvent.getTransaction();
                    transactionProcessor.processTransaction(transaction);
                })
                .get();
    }
}
