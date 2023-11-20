package com.depara.microservico1.dtos;

import jakarta.validation.constraints.NotNull;;

public record DeParaResponseDTO(@NotNull int broker, @NotNull String userBA) {

}
