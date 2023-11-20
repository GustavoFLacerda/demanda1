package com.depara.microservico1.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "PARCEIRO")
@Data
@EqualsAndHashCode
public class Partner {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ID_PARCEIRO", updatable = false, unique = true, columnDefinition = "TEXT")
    private UUID id;

    @Column(name = "NM_PARCEIRO", columnDefinition = "VARCHAR(100)", nullable = false)
    private String name;

    @Column(name = "CD_USR_INCLUSAO", columnDefinition = "CHAR(15)", nullable = false)
    private String usercode;

    @Column(name = "DT_INCLUSAO", columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime inclusiondate;

    @Column(name = "CD_USR_ATUALIZACAO", columnDefinition = "CHAR(15)")
    private String updateusercode;

    @Column(name = "DT_ATUALIZACAO", columnDefinition = "TIMESTAMP")
    private LocalDateTime updatedate;

    public Partner() {

    }

    // dto constructor
}
