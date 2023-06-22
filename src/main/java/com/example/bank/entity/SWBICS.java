package com.example.bank.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="SWBICS")
public class SWBICS {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SWBIC_ID", nullable = false)
    private Long swbicId;

    @Column(name = "SWBIC")
    private String swbic;

    @Column(name = "DefaultSWBIC")
    private Integer defaultSWBIC;

}
