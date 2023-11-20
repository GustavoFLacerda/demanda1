package com.depara.microservico1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.depara.microservico1.entities.AllianzData;

@Repository
public interface AllianzDataRepository extends JpaRepository<AllianzData, Integer> {
}
