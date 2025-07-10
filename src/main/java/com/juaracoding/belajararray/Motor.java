package com.juaracoding.belajararray;

public class Motor extends Kendaraan {

  public Motor(String name) {
    super(name);
  }

  @Override
  public void jalan() {
    System.out.println(this.getName() + " berjalan di darat.");
  }

  @Override
  public void startEngine() {
    System.out.println("Start mesin motor.");
  }

  @Override
  public void stopEngine() {
    System.out.println("Stop mesin motor.");
  }

}
