package com.juaracoding.belajararray;

public class App 
{
    public static void main( String[] args )
    {
        // Ver 1 Array
        int kontrakan[] = new int[8];
        int hargaPerOrang = 300000;
        kontrakan[0] = 4;
        kontrakan[1] = 2;
        kontrakan[2] = 2;
        kontrakan[3] = 7;
        kontrakan[4] = 2;
        kontrakan[5] = 6;
        kontrakan[6] = 1;
        kontrakan[7] = 3;

        // System.out.println(kontrakan[0]);
        // System.out.println(kontrakan[1]);
        // System.out.println(kontrakan[2]);
        // System.out.println(kontrakan[3]);
        // System.out.println(kontrakan[4]);
        // System.out.println(kontrakan[5]);
        // System.out.println(kontrakan[6]);
        // System.out.println(kontrakan[7]);


        // int homeLoan[] = {4,2,2,7,2,6,1,3};
        // System.out.println(homeLoan[0]);
        // System.out.println(homeLoan[1]);
        // System.out.println(homeLoan[2]);
        // System.out.println(homeLoan[3]); 
        // System.out.println(homeLoan[4]);
        // System.out.println(homeLoan[5]);
        // System.out.println(homeLoan[6]);
        // System.out.println(homeLoan[7]);

        for (int index = 0; index < kontrakan.length; index++) {
            System.out.println(kontrakan[index] * hargaPerOrang);
        
        }



    }
}
