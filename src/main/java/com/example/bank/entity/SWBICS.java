package com.example.bank.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="SWBICS")
public class SWBICS {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "SWBIC")
    private String swbic;

    @Column(name = "DefaultSWBIC")
    private Integer defaultSWBIC;

}
