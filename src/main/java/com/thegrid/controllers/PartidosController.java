package com.thegrid.controllers;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.response.NotFoundException;
import com.googlecode.objectify.ObjectifyService;
import com.thegrid.Constants;
import com.thegrid.models.Partido;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

import static com.googlecode.objectify.ObjectifyService.ofy;

@Api(
        name = "partidosmanager",
        version = "v1",
        scopes = {Constants.EMAIL_SCOPE},
        clientIds = {Constants.WEB_CLIENT_ID, Constants.ANDROID_CLIENT_ID, Constants.IOS_CLIENT_ID},
        audiences = {Constants.ANDROID_AUDIENCE}
)
public class PartidosController {

    public static ArrayList<Partido> partidos = new ArrayList<Partido>();

    static {
        //ObjectifyService.register(Partido.class);
    }
/*
    public List<Partido> listPartidos() {
        //ObjectifyService.ofy().save().entity(new Partido()).now();
        partidos.add(new Partido());
       // return ObjectifyService.ofy().load().type(Partido.class).list();
        return partidos;
    }

    public Partido getPartido(@Named("id") Integer id) throws NotFoundException {
        try {
            return partidos.get(id);
        } catch (IndexOutOfBoundsException e) {
            throw new NotFoundException("Partido not found with an index: " + id);
        }
    }
*/
}
