package com.depara.microservico1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.time.LocalDateTime;

@Entity
@Table(name = "PERFIL")
@Data
@EqualsAndHashCode
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PERFIL", updatable = false, nullable = false, columnDefinition = "SMALLINT")
    private int id;

    // fk?
    @Column(name = "NM_PARCEIRO", nullable = false, columnDefinition = "VARCHAR(100)")
    private String partnername;

    @Column(name = "CD_USR_INCLUSAO", columnDefinition = "CHAR(15)", nullable = false)
    private String usercode;

    @Column(name = "DT_INCLUSAO", columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime inclusiondate;

    @Column(name = "CD_USR_ATUALIZACAO", columnDefinition = "CHAR(15)")
    private String updateusercode;

    @Column(name = "DT_ATUALIZACAO", columnDefinition = "TIMESTAMP")
    private LocalDateTime updatedate;

    public Profile() {

    }
}
