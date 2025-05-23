package com.filipedevgenz.desafiojunioritau.dto;

import jakarta.servlet.annotation.HttpConstraint;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import org.springframework.http.HttpStatus;

import java.time.OffsetDateTime;

public record TransacaoRequestDto(

        @NotNull(message = "O valor nao deve ser nulo")
        @DecimalMin(value = "0", message = "O valor nao deve ser negativo")
        Double valor,

        @NotNull(message = "data/hora não deve ser nula")
        @Past(message = "data/hora não pode ser no futuro")
        OffsetDateTime dataHora
)
{}
