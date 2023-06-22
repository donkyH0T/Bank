package com.example.bank.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "ACCRSTR_LIST")
public class AccRstrList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="AccRstr")
    private String accRstr;

    @Column(name="AccRstrDate")
    private LocalDate accRstrDate;

}
