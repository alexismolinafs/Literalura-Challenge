package com.mx.aluracursos.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public record autorRecord(
        @JsonAlias("name") String nombre,
        @JsonAlias("birth_year") Integer cumpleanios,
        @JsonAlias("death_year") Integer fechaFallecimiento
) {

   
}
