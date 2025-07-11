package com.juaracoding.belajararray.models;

public class ProductException extends Exception {

  private String errorCode;

  public ProductException(String message) {
    super(message);
    this.errorCode = "PE-001";
  }

  public String getErrorCode() {
    return errorCode;
  }

  public void print() {
    System.out.println("[" + getErrorCode() + "]: " + getMessage());
  }

}
