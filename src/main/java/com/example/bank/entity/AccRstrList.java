package com.example.bank.entity;

import com.example.bank.enitiyListener.AuditableEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Schema(description = "Сущность для AccRstrList")
@Data
@Table(name = "ACCRSTR_LIST")
public class AccRstrList extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="AccRstr")
    private String accRstr;

    @Column(name="AccRstrDate")
    private LocalDate accRstrDate;

}
