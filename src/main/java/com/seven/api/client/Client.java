package com.seven.api.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Client {
  @JsonProperty("id")
  private Long id;
  @JsonProperty("name")
  private String name;
  @JsonProperty("email")
  private String email;
  @JsonProperty("phone")
  private String phone;

  public Client(Long id, String name, String email, String phone) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.phone = phone;
  };

  public Client() {
  };

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
