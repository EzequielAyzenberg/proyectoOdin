package com.thegrid.controllers;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.thegrid.Constants;
import com.thegrid.models.Etiqueta;

import java.util.Arrays;
import java.util.List;

@Api(
        name = "partidosmanager",
        version = "v1",
        scopes = {Constants.EMAIL_SCOPE},
        clientIds = {Constants.WEB_CLIENT_ID, Constants.ANDROID_CLIENT_ID, Constants.IOS_CLIENT_ID},
        audiences = {Constants.ANDROID_AUDIENCE}
)
public class EtiquetasController {

    @ApiMethod(
            name = "etiqueta",
            path = "etiqueta",
            httpMethod = ApiMethod.HttpMethod.GET
    )
    public List<Etiqueta> getEtiquetas() {
        return Arrays.asList(
                new Etiqueta("tag1"),
                new Etiqueta("tag2"),
                new Etiqueta("tag3"),
                new Etiqueta("tag4"),
                new Etiqueta("tag5")
        );
    }

}
