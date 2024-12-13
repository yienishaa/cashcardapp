package com.example.cashcardapp;

import org.springframework.data.annotation.Id;

public record CashCard(@Id Integer id, Double amount){
}
