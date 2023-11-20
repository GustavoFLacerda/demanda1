package com.depara.microservico1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.depara.microservico1.dtos.DeParaRequestDTO;
import com.depara.microservico1.dtos.DeParaResponseDTO;
import com.depara.microservico1.entities.AllianzData;
import com.depara.microservico1.repositories.AllianzDataRepository;
import com.depara.microservico1.repositories.CooperativeRepository;
import com.depara.microservico1.repositories.PartnerRepository;
import com.depara.microservico1.repositories.ProfileRepository;

import jakarta.transaction.Transactional;

@Service
public class DeParaService {

    @Autowired
    private ProfileRepository profileRepository;

    @Autowired
    private PartnerRepository partnerRepository;

    @Autowired
    private CooperativeRepository cooperativeRepository;

    @Autowired
    private AllianzDataRepository allianzDataRepository;

    @Transactional
    public ResponseEntity<DeParaResponseDTO> getBrokerandUserBa(DeParaRequestDTO data) {

        var profile = profileRepository.findById(Integer.valueOf(data.profile()));

        var cooperative = cooperativeRepository.findByUnitcode(data.internalCode());

        var user = allianzDataRepository.findById(Integer.valueOf(data.userId()));

        if (profile.isEmpty() || cooperative.size() == 0 || user.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        AllianzData allianz = user.get();

        DeParaResponseDTO response = new DeParaResponseDTO(allianz.getBroker(), allianz.getUserBa());
        return new ResponseEntity<>(response, HttpStatus.OK);

    }

}
