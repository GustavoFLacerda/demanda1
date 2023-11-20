package com.depara.microservico1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.depara.microservico1.entities.Profile;
import java.util.List;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {
    public List<Profile> findByPartnername(String partnername);
}
