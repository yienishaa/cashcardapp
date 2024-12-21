package com.example.cashcardapp.controller;

import com.example.cashcardapp.model.CardDataModel;
import com.example.cashcardapp.repository.CashCardRepository;
import com.example.cashcardapp.service.CashCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@RestController
public class CashCardController implements CashCardControllerInterface{

    private final CashCard cashCard;

    @Autowired
    private CashCardController(CashCard cashCard) {
        this.cashCard = cashCard;
    }

    @Override
    public ResponseEntity<CashCard> findById(Integer requestId) {
        //the requestId variable name matches the one in URL so Spring knows to assign value

        Optional<CashCard> cashCardObj = Optional.ofNullable(cashCard);
        //We're calling JpaRepository.findById, which returns an Optional.
        // This smart object might or might not contain the CashCard for which we're searching

        if (cashCardObj.isPresent()) {
            return new ResponseEntity<>(cashCardObj.get(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @Override
    public ResponseEntity<String> addCashCard(Integer requestId, CardDataModel cashCard) {
        System.out.println("Req ID "+requestId);
        System.out.println("CashCard "+cashCard);
        this.cashCard.create(cashCard);

        return new ResponseEntity<>("Added",HttpStatus.OK);
    }


}
