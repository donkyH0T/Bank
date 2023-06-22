package com.example.bank.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class BankData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade=CascadeType.ALL)
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
