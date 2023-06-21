package com.example.bank.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "RSTR_LIST")
public class RstrList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Rstr_id", nullable = false)
    private Long rstrId;

    @Column(name="Rstr")
    private String rstr;

    @Column(name="RstrDate")
    private LocalDate rstrDate;

    @OneToMany(mappedBy = "rstrList", fetch = FetchType.LAZY)
    private List<ParticipantInfo> participantInfoList;
}
