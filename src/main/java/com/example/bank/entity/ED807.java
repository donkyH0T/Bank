package com.example.bank.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "ED807")
@Data

public class ED807 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "EDNo")
    private String edNo;


    @Column(name = "EdDate")
    private LocalDate edDate;

    @Column(name = "EDAuthor")
    private String edAuthor;

    @Column(name = "CreationReason")
    private String creationReason;

    @Column(name = "CreationDateTime")
    private LocalDateTime creationDateTime;

    @Column(name = "InfoTypeCode")
    private String infoTypeCode;

    @Column(name = "BusinessDay")
    private LocalDate businessDay;

    @Column(name = "DirectoryVersion")
    private Integer directoryVersion;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "ed807_id")
    private List<BICDirectoryEntry> bicDirectoryEntry;
}
