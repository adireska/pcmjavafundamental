package com.juaracoding.belajararray.models;

public class Cart {
  private Product product;
  private int qty;
  private int subtotal;

  public Cart(Product product, int qty) {
    this.product = product;
    this.qty = qty;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public int getSubtotal() {
    return subtotal;
  }

  public void calculateSubtotal() {
    this.subtotal = product.getPrice() * qty;
  }

}
