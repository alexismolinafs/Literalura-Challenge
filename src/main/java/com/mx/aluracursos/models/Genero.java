package com.mx.aluracursos.models;

public enum Genero {
    ACCION ("Action"),
    ROMANCE ("Romance"),
    CRIMEN ("Crime"),
    COMEDIA ("Comedy"),
    DRAMA ("Drama"),
    AVENTURA ("Adventure"),
    FICCION ("Fiction"),
    DESCONOCIDO("Desconocido");



    private String genero;


    Genero(String generoDb){
        this.genero = generoDb;
    }

    public static Genero fromString(String text){
         for (Genero generoEnum: Genero.values()){
            if (generoEnum.genero.equals(text)){
                return generoEnum;
            }
        }
        return Genero.DESCONOCIDO;
    }
}
