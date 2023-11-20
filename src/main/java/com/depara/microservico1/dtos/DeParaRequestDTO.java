package com.depara.microservico1.dtos;

import jakarta.validation.constraints.NotNull;

public record DeParaRequestDTO(@NotNull String userId, @NotNull String profile, @NotNull String internalCode) {

}
