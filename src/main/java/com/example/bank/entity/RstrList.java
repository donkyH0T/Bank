package com.example.bank.entity;

import com.example.bank.enitiyListener.AuditableEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Schema(description = "Сущность для RstList")
@Entity
@Data
@Table(name = "RSTR_LIST")
public class RstrList extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Rstr_id", nullable = false)
    private Long rstrId;

    @Column(name="Rstr")
    private String rstr;

    @Column(name="RstrDate")
    private LocalDate rstrDate;
}
