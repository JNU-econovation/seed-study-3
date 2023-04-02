package com.seed.study.Event;

import com.seed.study.dto.Transaction;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Getter
public class PaymentProcessEvent {
    private Transaction transaction;
}
