package com.example.kafka.collector;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Locale;


@ToString
@Getter
@AllArgsConstructor
public class Order {
    private String orderNumber;
    private String orderProductName;
    private Integer payPrice;
    private Currency currency;


    List<Order> orders = new ArrayList<>() {{
        add(new Order("0000001", "자전거", 1000000, Currency.getInstance(Locale.KOREA)));
        add(new Order("0000002", "컴퓨터", 1000000, Currency.getInstance(Locale.KOREA)));
        add(new Order("0000003", "에어컨", 3000000, Currency.getInstance(Locale.US)));
        add(new Order("0000004", "냉장고", 5000000, Currency.getInstance(Locale.CHINA)));
    }};
}