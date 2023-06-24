package com.example.bank.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date insert;
    private Date update;
    private Date delete;

    @Column(name = "UPDATED_BY")
    private String updatedBy;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "DELETED_BY")
    private String deletedBy;
}
