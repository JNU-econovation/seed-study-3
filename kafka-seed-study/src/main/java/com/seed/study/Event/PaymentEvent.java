package com.seed.study.Event;

import com.seed.study.domain.Payment;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentEvent {
    private String pamentId;
}