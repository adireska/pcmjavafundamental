package com.juaracoding.belajararray;

public abstract class Kendaraan implements IMesin{
    private String name;

    public Kendaraan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void jalan();
}
