package com.thegrid.controllers;

import com.google.api.server.spi.config.Api;
import com.googlecode.objectify.ObjectifyService;
import com.thegrid.Constants;
import com.thegrid.models.Recomendacion;

import java.util.ArrayList;

@Api(
        name = "partidosmanager",
        version = "v1",
        scopes = {Constants.EMAIL_SCOPE},
        clientIds = {Constants.WEB_CLIENT_ID, Constants.ANDROID_CLIENT_ID, Constants.IOS_CLIENT_ID},
        audiences = {Constants.ANDROID_AUDIENCE}
)
public class RecomendacionesController {

    public static ArrayList<Recomendacion> recomendaciones = new ArrayList<Recomendacion>();

    static {
        //ObjectifyService.register(Recomendacion.class);
    }

    public ArrayList<Recomendacion> listRecomendacion() {
        return recomendaciones;
    }
}
