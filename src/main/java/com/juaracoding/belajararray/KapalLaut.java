package com.juaracoding.belajararray;

public class KapalLaut extends Kendaraan {

  public KapalLaut(String name) {
    super(name);
  }

  @Override
  public void jalan() {
    System.out.println(this.getName() + " berjalan di laut.");
  }

  @Override
  public void startEngine() {
    System.out.println("Hidupkan mesin kapal.");
  }

  @Override
  public void stopEngine() {
    System.out.println("Matikan mesin kapal.");
  }
}
