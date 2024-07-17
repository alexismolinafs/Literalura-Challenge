package com.mx.aluracursos.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "autores")
public class Autor {
    private Long id;
}
