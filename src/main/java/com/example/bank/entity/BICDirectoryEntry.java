package com.example.bank.entity;

import com.example.bank.enitiyListener.AuditableEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Schema(description = "Сущность для BICDirectoryEntry")
@Entity
@Data
@Table(name = "BIC_DIRECTORY_ENTRY")
public class BICDirectoryEntry extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "BIC")
    private String bic;

    @OneToOne( cascade = CascadeType.ALL)
    @JoinColumn(name = "participantInfo_id")
    private ParticipantInfo participantInfo;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "accounts_id")
    private List<Accounts> accounts;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "swbics_Id")
    private List<SWBICS> swbics;

}
