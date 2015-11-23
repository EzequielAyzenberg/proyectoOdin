package com.thegrid.models;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Usuario {
    @Id
    private Long id;

    private Long facebook_id;
}
