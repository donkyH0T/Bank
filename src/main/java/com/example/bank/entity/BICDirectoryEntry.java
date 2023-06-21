package com.example.bank.entity;

import jakarta.persistence.*;
import lombok.Data;


import java.util.List;

@Entity
@Data
@Table(name = "BIC_DIRECTORY_ENTRY")
public class BICDirectoryEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ed807_id")
    private ED807 ed807;

    @Column(name = "BIC")
    private String bic;

    @OneToOne(mappedBy = "bicDirectoryEntry", cascade = CascadeType.ALL, orphanRemoval = true)
    private ParticipantInfo participantInfo;

    @OneToMany(mappedBy = "bicDirectoryEntry", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Accounts> accounts;

    @OneToOne(mappedBy = "bicDirectoryEntry", cascade = CascadeType.ALL, orphanRemoval = true)
    private SWBICS swbics;

}
