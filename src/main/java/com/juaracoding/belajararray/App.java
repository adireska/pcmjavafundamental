package com.juaracoding.belajararray;

public class App {
    public static void main(String[] args) {
        Motor motor = new Motor("Honda Supra X");
        Kendaraan kapalFeri = new KapalLaut("Kapal Feri");
        Pesawat garuda = new Pesawat("Garuda Boing Banget");
        Kendaraan sepeda = new Sepeda("Ontel");

        motor.jalan();
        motor.startEngine();
        motor.stopEngine();
        garuda.startEngine();
        garuda.stopEngine();
        kapalFeri.jalan();
        garuda.jalan();

        sepeda.startEngine();

        
    }
}
