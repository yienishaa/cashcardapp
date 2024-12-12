package com.example.cashcardapp.controller;

import org.springframework.web.bind.annotation.*;
import com.example.cashcardapp.service.CashCardService;
import org.springframework.http.ResponseEntity;

@RestController
public class CashCardController {

    @GetMapping("/cashcards")
    public ResponseEntity<CashCardService> findById(@RequestParam(value = "cardnum", required = true) Long cardnum) {

        CashCardService cashCardService = new CashCardService(cardnum, 123.45);
        return ResponseEntity.ok(cashCardService);
    }

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    
}
