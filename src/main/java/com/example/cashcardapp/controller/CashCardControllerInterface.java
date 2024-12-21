package com.example.cashcardapp.controller;

import com.example.cashcardapp.model.CardDataModel;
import com.example.cashcardapp.service.CashCard;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface CashCardControllerInterface {

    //GetMapping tells Spring to route only GET requests
    @GetMapping("/cashcards/q")
    public ResponseEntity<CashCard> findById(@RequestParam Integer requestId);

    @PostMapping("/cashcards/card")
    public ResponseEntity<String> addCashCard(@RequestParam Integer requestId, @RequestBody CardDataModel cashCard);

}
