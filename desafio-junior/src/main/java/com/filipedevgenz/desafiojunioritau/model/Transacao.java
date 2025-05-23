package com.filipedevgenz.desafiojunioritau.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.OffsetDateTime;
@Getter
@AllArgsConstructor
public class Transacao {
    @NotNull(message = "O valor nao deve ser nulo")
        @Min(value = 0, message = "O valor nao deve ser nulo")
    Double valor;

    @NotNull(message = "data/hora não deve ser nula")
            @Past(message = "data/hora não pode ser no futuro")
    OffsetDateTime dataHora;
}
