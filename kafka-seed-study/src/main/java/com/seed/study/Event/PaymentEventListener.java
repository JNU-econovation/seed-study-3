package com.seed.study.Event;

import com.seed.study.service.TransactionProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class PaymentEventListener {
//    private final TransactionProcessor transactionProcessor;

 /*   public IntegrationFlow handlePaymentProcessedEvent() {
        return IntegrationFlows.from("paymentProcessChannel")
                .handle(event -> {
                    PaymentProcessEvent paymentProcessedEvent = (PaymentProcessEvent) event.getPayload();
                    Transaction transaction = paymentProcessedEvent.getTransaction();
                    transactionProcessor.processTransaction(transaction);
                })
                .get();
    }*/
}
