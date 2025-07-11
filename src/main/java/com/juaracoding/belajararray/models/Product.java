package com.juaracoding.belajararray.models;

public class Product {
  private String id;
  private String name;
  private int price;

  public Product(String id, String name, int price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public Product() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) throws ProductException {
    if (id.isEmpty()) {
      throw new ProductException("Id tidak boleh kosong");
    }
    
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) throws Exception {
    if (name.isEmpty()) {
      throw new Exception("Name tidak boleh kosong");
    }
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) throws Exception {
    if (price <= 0) {
      throw new Exception("Woi price lu kaga boleh <= 0");
    }

    this.price = price;
  }

}
