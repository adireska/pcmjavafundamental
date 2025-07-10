package com.juaracoding.belajararray;

public class App {
    public static void main(String[] args) {
      Kendaraan[] kendaraans = new Kendaraan[4];
      kendaraans[0] = new Motor("Honda Supra X");
      kendaraans[1] = new KapalLaut("Kapal Feri");
      kendaraans[2] = new Pesawat("Garuda");
      kendaraans[3] = new Sepeda("Ontel");

      for (Kendaraan kendaraan : kendaraans) {
         try {
            kendaraan.startEngine();
            kendaraan.jalan();
            kendaraan.stopEngine();
         } catch (UnsupportedOperationException e) {
            continue;
         }
      }
        
    }
}
