package com.seed.study.Event;

import com.seed.study.domain.Payment;
import com.seed.study.service.TransactionProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;


@Component
@RequiredArgsConstructor
public class PaymentEventListener {
    private void a(){
        Map a = new HashMap<>();
        List b = new LinkedList();
        long count = b.stream().collect(Collectors.counting());
        Comparator<Long> tComparator = Comparator.comparingLong(Payment::getId);
        Optional<Payment> c = b.stream().collect(Collectors.maxBy(tComparator));

        List<Order> orders = new ArrayList<>() {{
            add(new Order("0000001", "자전거", 1000000, Currency.getInstance(Locale.KOREA)));
            add(new Order("0000002", "컴퓨터", 1000000, Currency.getInstance(Locale.KOREA)));
            add(new Order("0000003", "에어컨", 3000000, Currency.getInstance(Locale.US)));
            add(new Order("0000004", "냉장고", 5000000, Currency.getInstance(Locale.CHINA)));
        }};

    }
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
