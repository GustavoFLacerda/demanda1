package com.depara.microservico1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.depara.microservico1.entities.Cooperative;
import java.util.List;

@Repository
public interface CooperativeRepository extends JpaRepository<Cooperative, Integer> {
    public List<Cooperative> findByUnitcode(String unitcode);
}
