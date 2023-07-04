package com.example.bank.entity;

import com.example.bank.enitiyListener.AuditableEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

@Schema(description = "Сущность для SWBICS")
@Entity
@Data
@Table(name="SWBICS")
public class SWBICS extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "SWBIC")
    private String swbic;

    @Column(name = "DefaultSWBIC")
    private Integer defaultSWBIC;

}
