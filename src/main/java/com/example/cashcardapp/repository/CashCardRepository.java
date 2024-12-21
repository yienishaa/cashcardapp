package com.example.cashcardapp.repository;

import com.example.cashcardapp.model.CardDataModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CashCardRepository extends JpaRepository<CardDataModel, Integer> {
}
