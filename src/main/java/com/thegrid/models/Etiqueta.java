package com.thegrid.models;

import com.google.api.server.spi.config.ApiResourceProperty;

public class Etiqueta {

    @ApiResourceProperty(name = "nombre")
    private String _nombre;

    public Etiqueta() {

    }

    public Etiqueta(String nombre){
        _nombre = nombre;
    }
}
