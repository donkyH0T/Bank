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
    private int defaultSWBIC;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bic_directory_entry_id")
    private BICDirectoryEntry bicDirectoryEntry;
}
