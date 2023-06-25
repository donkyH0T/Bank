package com.example.bank.entity;

import com.example.bank.enitiyListener.AuditableEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

@Schema(description = "Сущность для bankDate ")
@Entity
@Data
public class BankData extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "ed807_id")
    private ED807 ed807;

    @Lob
    @Column(length = 10485760)
    private byte[] bytes;

    public BankData(byte[] bytes) {
        this.bytes = bytes;
    }

    public BankData() {
    }
}
