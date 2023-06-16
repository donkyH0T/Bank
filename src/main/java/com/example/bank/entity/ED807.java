package com.example.bank.entity;

import com.example.bank.adapters.DateAdapter;
import com.example.bank.adapters.LocalDateTimeAdapter;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "ED807")
@Data
@XmlRootElement(name = "ED807", namespace = "urn:cbr-ru:ed:v2.0")
@XmlAccessorType(XmlAccessType.FIELD)

public class ED807 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @XmlAttribute(name = "EDNo")
    @Column(name = "EDNo")
    private String edNo;


    @XmlElement(name = "EDDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date edDate;

    @XmlAttribute(name = "EDAuthor")
    @Column(name = "EDAuthor")
    private String edAuthor;

    @XmlAttribute(name = "CreationReason")
    @Column(name = "CreationReason")
    private String creationReason;

    @XmlElement(name = "CreationDateTime", required = true)
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime creationDateTime;

    @XmlAttribute(name = "InfoTypeCode")
    @Column(name = "InfoTypeCode")
    private String infoTypeCode;

    @XmlElement(name = "BusinessDay", required = true)
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date businessDay;

    @XmlAttribute(name = "DirectoryVersion")
    @Column(name = "DirectoryVersion")
    private Integer directoryVersion;



    @OneToMany(mappedBy = "ed807", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BICDirectoryEntry> bicDirectoryEntries;
}
