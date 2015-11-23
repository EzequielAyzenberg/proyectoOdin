package com.thegrid;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.response.NotFoundException;
import com.google.appengine.api.users.User;

import java.util.ArrayList;

import javax.inject.Named;

/**
 * Defines v1 of a partidosmanager API.
 */
@Api(
    name = "partidosmanager",
    version = "v1",
    scopes = {Constants.EMAIL_SCOPE},
    clientIds = {Constants.WEB_CLIENT_ID, Constants.ANDROID_CLIENT_ID, Constants.IOS_CLIENT_ID},
    audiences = {Constants.ANDROID_AUDIENCE}
)
public class PartidosManager {

  public static ArrayList<Partido> partidos = new ArrayList<Partido>();

  static {
    partidos.add(new Partido("hello world!"));
    partidos.add(new Partido("goodbye world!"));
  }

  public Partido getPartido(@Named("id") Integer id) throws NotFoundException {
    try {
      return partidos.get(id);
    } catch (IndexOutOfBoundsException e) {
      throw new NotFoundException("Partido not found with an index: " + id);
    }
  }

  public ArrayList<Partido> listPartido() {
    return partidos;
  }

  @ApiMethod(name = "partidos.multiply", httpMethod = "post")
  public Partido insertPartido(@Named("times") Integer times, Partido partido) {
    Partido response = new Partido();
    StringBuilder responseBuilder = new StringBuilder();
    for (int i = 0; i < times; i++) {
      responseBuilder.append(partido.getMessage());
    }
    response.setMessage(responseBuilder.toString());
    return response;
  }

  @ApiMethod(name = "partidos.authed", path = "partidosmanager/authed")
  public Partido authedPartido(User user) {
    Partido response = new Partido("hello " + user.getEmail());
    return response;
  }
}
