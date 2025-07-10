package com.juaracoding.belajararray;

public class Pesawat extends Kendaraan {

  public Pesawat(String name) {
    super(name);
  }

  @Override
  public void jalan() {
    System.out.println(this.getName() + " terbang di udara.");
  }

  public void startEngine() {
    System.out.println(this.getName() + " Nyalakan Mesin Pesawat");
  }

  public void stopEngine() {
    System.out.println(this.getName() + " Matikan Mesin Pesawat");
  }

}
