package com.juaracoding.pcmjavafundamental;

public class Percabangan {
    public static void main(String[] args) {

//        if(false){
//            System.out.println("Statement");
//        }
//        System.out.println("Next Statement");
//
//        int num = 6;
//
//        if (num % 2 == 0){
//            System.out.println(num +" adalah bilangan genap");
//        } else {
//            System.out.println(num +" adalah bilangan ganjil");
//        }

        // if else untuk stock case tokopedia
//        int stock = 2;
//        if (stock >= 1){
//            System.out.println("Button add cart clickable");
//        } else {
//            System.out.println("Button add cart disable");
//        }
//
//        int jmlPembelian = 2;
//        if (jmlPembelian <= stock){
//            System.out.println(jmlPembelian + " Stock tersedia");
//        } else {
//            System.out.println("Maximal Pembelian " + stock + " item");
//        }
//
//        int minReq = 1;
//        if (jmlPembelian >= minReq){
//            System.out.println("Lanjutkan Checkout");
//        }else {
//            System.out.println("Jumlah Minimal Pembelian " + minReq + " item");
//        }
//
//        int price = 10500000;
//        System.out.println(jmlPembelian * price);

        //nested if
        int stock = 2;
        int jmlPembelian = 3;
        int minReq = 1;
        int price = 10500000;

        // Tombol hanya bisa diklik jika stok cukup DAN jumlah pembelian tidak melebihi stok
        if (stock >= 1 && jmlPembelian <= stock) {
            System.out.println("Button add cart clickable");
            System.out.println(jmlPembelian + " Stock tersedia");
            if (jmlPembelian >= minReq) {
                System.out.println("Lanjutkan Checkout");
                System.out.println("Total Harga: Rp " + (jmlPembelian * price));
            } else {
                System.out.println("Jumlah Minimal Pembelian " + minReq + " item");
            }
        } else {
            System.out.println("Button add cart disable");
            if (stock < 1) {
                System.out.println("Stok habis");
            } else if (jmlPembelian > stock) {
                System.out.println("Maximal pembelian hanya " + stock + " item");
            }
        }
    }
}



