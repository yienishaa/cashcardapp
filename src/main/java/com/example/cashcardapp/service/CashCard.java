package com.example.cashcardapp.service;


import jakarta.persistence.*;


@Entity
public class CashCard{
    @Id  // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generate the ID
    private Integer id;

    @Column(unique = true, nullable = false)  // Ensures the name is unique and not null
    private Double amount;
}
