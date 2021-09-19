package com.company.model;

import com.company.service.PayMoneyService;

public class PayMoneyApp {
    public static void main(String[] args) {
        PayMoneyService payMoneyService = new PayMoneyService();
        payMoneyService.implementPayMoney();
    }
}
