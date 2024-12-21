package com.example.cashcardapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity //This annotation is to tell this class corresponds to a table in a DB
@Table(name = "CASH_CARD")
public class CardDataModel {

    @Id //To mention this is the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("card_num") //This is to map the JSON key to the table column. So JSON key = card_num, and Table col = id
    private Integer cardnum;

    @Column //This is to tell the variable coresponds to a column in the table, if the name is different set name with @Column(name = "column_name")
    @JsonProperty("balance")//This is to map the JSON key to the table column. So JSON key = balance, and Table col = amount
    private Double amount;

}
