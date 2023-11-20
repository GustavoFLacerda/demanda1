package com.depara.microservico1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.depara.microservico1.dtos.DeParaRequestDTO;
import com.depara.microservico1.dtos.DeParaResponseDTO;
import com.depara.microservico1.services.DeParaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1")
public class DeParaController {

    @Autowired
    private DeParaService deParaService;

    @GetMapping("/data-access")
    public ResponseEntity<DeParaResponseDTO> getBrokerandUserBa(@Valid @RequestBody DeParaRequestDTO request) {

        var response = deParaService.getBrokerandUserBa(request);
        return response;

    }

}
