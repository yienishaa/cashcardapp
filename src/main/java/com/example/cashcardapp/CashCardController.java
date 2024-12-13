package com.example.cashcardapp;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@RequestMapping("/cashcards")
@RestController
public class CashCardController {

    private final CashCardRepository cashCardRepository;

    private CashCardController(CashCardRepository cashCardRepository) {
        this.cashCardRepository = cashCardRepository;
    }

    @GetMapping("/{requestId}") //GetMapping tells Spring to route only GET requests
    public ResponseEntity<CashCard> findById(@PathVariable Integer requestId) {
        //the requestId variable name matches the one in URL so Spring knows to assign value
        //CashCard cashCard = new CashCard(requestId, 123.22);
        System.out.println(requestId);
        Optional<CashCard> cashCard = cashCardRepository.findById(requestId);
        //We're calling CrudRepository.findById, which returns an Optional.
        // This smart object might or might not contain the CashCard for which we're searching
        if (cashCard.isPresent()) {
            return new ResponseEntity<>(cashCard.get(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }



    
}
