package com.example.cashcardapp.repository;

import com.example.cashcardapp.service.CashCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface CashCardRepository extends JpaRepository<CashCard, Integer> {
    //Optional<CashCard> findByName(String name);
    Optional<CashCard> findById(Integer id);
}
