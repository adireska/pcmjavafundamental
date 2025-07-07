package com.juaracoding.belajararray;

public class BelajarPencarian {
    public static void main(String[] args) {
        String cariNama = "blood";
        boolean isKetemu = false;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equalsIgnoreCase(cariNama)) {
                isKetemu = true;
                break;
            }
        }

        if (isKetemu) {
            System.out.println("Data " + cariNama + " Di Temukan");
        } else {
            System.out.println("Data " + cariNama + " Tidak Di Temukan");
        }
    }
    
}
