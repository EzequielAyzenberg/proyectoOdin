package com.thegrid.models;

import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Load;

@Entity
public class Inscripto {
    @Id
    private Long id;

    @Load
    private Ref<Usuario> usuario;
    @Load
    private Ref<Partido> partido;
    private String puesto;
}
