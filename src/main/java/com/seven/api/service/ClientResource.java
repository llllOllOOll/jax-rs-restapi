package com.seven.api.service;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import com.seven.api.client.Client;
import com.seven.api.dao.ClientDAO;

@Path("/clients")
public class ClientResource {
  private ClientDAO db = new ClientDAO();

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Client createClient(Client client) {
    return db.insert(client);
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/{id}")
  public Client getClient(@PathParam("id") Long id) {
    return db.getById(id);
  }

  @PUT
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("/{id}")
  public Client updateClient(@PathParam("id") Long id, Client client) {
    client.setId(id); // Ensure the client ID is set for the update
    return db.update(client);
  }

  @DELETE
  @Path("/{id}")
  public void deleteClient(@PathParam("id") Long id) {
    db.delete(id);
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Client> getAllClients() {
    return db.getAll();
  }
}
