package com.seven.api.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.seven.api.client.Client;

public class ClientDAO {
  private static Map<Long, Client> db = new HashMap<>();

  public static Client insert(Client client) {
    db.put(client.getId(), client);
    return client;
  }

  public Client update(Client client) {
    db.put(client.getId(), client);
    return client;
  }

  public void delete(Long id) {
    db.remove(id);
  }

  public Client getById(Long id) {
    return db.get(id);
  }

  public List<Client> getAll() {
    return db.values().stream().collect(Collectors.toList());
  }
}
