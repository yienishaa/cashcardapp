package com.example.cashcardapp.service;

public class CashCardService {

    private Long card_number;
    private Double card_balance;

    public CashCardService(){ }

    public CashCardService(Long number, Double amount){
        this.card_number = number;
        this.card_balance = amount;
    }

    public Double getBalance() {
        return this.card_balance;
    }

}
