package com.example.cashcardapp.service;

import com.example.cashcardapp.model.CardDataModel;

import java.util.List;
import java.util.Optional;

public interface CashCardInterface {


    CardDataModel create(CardDataModel cardDataModel);
    CardDataModel update(CardDataModel cardDataModel);
    void delete(CardDataModel cardDataModel);
    List<CardDataModel> getAll();
    Optional<CardDataModel> getById(Integer id);
}
