package com.juaracoding.pcmjavafundamental;

public class Variable {

//    public static void main(String[] args) {
//
//        byte minRequest = 10;
//        short maxProductInChart = 300;
//        int stock = 99000;
//        int price = 10500000;
//        long total = 300000000L;
//        float rating = 4.9f;
//        double saldo = 30000000000.50;
//    }


    public static void main(String[] args) {

        String address = "bumi mutara";
        String phoneNumber = "081286227421" ;
        String email = "adireska@gmail.com";
        String brithDay = "06 July 1998";
        String status = "Your Status is";
        char gender = 'M';
        boolean isStatus = true;



        System.out.println(address);
        System.out.println(phoneNumber);
        System.out.println(email);
        System.out.println(brithDay);
        System.out.println("Gender is " + gender);
        if (isStatus){
            System.out.println(status + " Active");
        }
        else {
            System.out.println(status + " Inactive");
        }



    }
}
