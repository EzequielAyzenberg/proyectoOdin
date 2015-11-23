package com.thegrid.models;

import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Load;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Partido {

    @Getter
    @Id
    private Long id;

    @Getter
    private String deporte;
    @Getter
    private Integer cant_personas;
    @Getter
    private String lugar;

    @Getter
    @Load
    private List<Ref<Inscripto>> inscriptos = new ArrayList<>();

    public Partido() {
        this.deporte = "Futbol";
        this.cant_personas = 5;
    }
}
