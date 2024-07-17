package com.mx.aluracursos.API;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
