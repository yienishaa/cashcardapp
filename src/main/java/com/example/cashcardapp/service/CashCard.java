package com.example.cashcardapp.service;


import com.example.cashcardapp.model.CardDataModel;
import com.example.cashcardapp.repository.CashCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CashCard implements CashCardInterface{

    private final CashCardRepository cashCardRepository;

    @Autowired
    public CashCard(CashCardRepository cashCardRepository) {
        this.cashCardRepository = cashCardRepository;
    }

    @Override
    public CardDataModel create(CardDataModel cardDataModel){
        return cashCardRepository.save(cardDataModel);
    }

    @Override
    public CardDataModel update(CardDataModel cardDataModel) {
        return null;
    }

    @Override
    public void delete(CardDataModel cardDataModel) {

    }

    @Override
    public List<CardDataModel> getAll() {
        return List.of();
    }

    @Override
    public Optional<CardDataModel> getById(Integer id) {
        return cashCardRepository.findById(id);
    }


}
