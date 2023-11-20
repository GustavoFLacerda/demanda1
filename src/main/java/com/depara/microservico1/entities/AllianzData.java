package com.depara.microservico1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "DADOSALLIANZ")
@Data
public class AllianzData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "INTEGER")
    private int id;

    @Column(name = "CD_MEDIADOR", columnDefinition = "INTEGER", nullable = false)
    private int broker;

    @Column(name = "DS_USUARIO_BA", columnDefinition = "CHAR(8)", nullable = false)
    private String userBa;

    public AllianzData() {

    }
}
