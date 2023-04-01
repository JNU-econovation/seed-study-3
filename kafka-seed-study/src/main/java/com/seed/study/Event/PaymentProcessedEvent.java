package com.seed.study.Event;

import com.seed.study.dto.Transaction;
import lombok.Data;

@Data
public class PaymentProcessedEvent {
    Transaction transaction;
}
