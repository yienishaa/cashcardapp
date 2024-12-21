package com.example.cashcardapp.controller;

import com.example.cashcardapp.repository.CashCardRepository;
import com.example.cashcardapp.service.CashCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@RestController
@RequestMapping("/cashcards")
public class CashCardController {

    @Autowired
    private final CashCardRepository cashCardRepository;

    private CashCardController(CashCardRepository cashCardRepository) {
        this.cashCardRepository = cashCardRepository;
    }

    @GetMapping("/q") //GetMapping tells Spring to route only GET requests
    public ResponseEntity<String> findById(@RequestParam Integer requestId) {
        //the requestId variable name matches the one in URL so Spring knows to assign value
        //CashCard cashCard = new CashCard(requestId, 123.22);

        System.out.println("req id = "+requestId);
        Optional<CashCard> cashCard = cashCardRepository.findById(requestId);
        //We're calling CrudRepository.findById, which returns an Optional.
        // This smart object might or might not contain the CashCard for which we're searching
        //System.out.println(cashCard.get());
        if (cashCard.isPresent()) {
            System.out.println("no eeror");
            return new ResponseEntity<>(cashCard.get().toString(), HttpStatus.OK);
        }
        else{
            System.out.println("eeror");
            return new ResponseEntity<>("Not found",HttpStatus.OK);
        }
    }



    
}
