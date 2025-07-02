package com.juaracoding.pcmjavafundamental;

public class Operator {
    public static void main(String[] args) {

        // aritmatika
        int modulus = 11 % 3;
        System.out.println(modulus);

        int x = 2;
        x++;
        int num1 = 10 * x;
        System.out.println(num1);
        System.out.println(x);

        int y = 2;
        int num2 = 10 * ++y;
        System.out.println(num2);

        int num3 = (10 + 5) * 5;
        System.out.println(num3);

        int a = 10;
        a += 5; // intinya tidak perlu di declare secara manual seperti a = 10 + 5
        System.out.println(a);

        // operator perbandingan
        boolean hasil = -2 < -0;
        System.out.println(hasil);

        // bitwise
        int result = 10 & 12;
        System.out.println(result);

        // right shift
        int num = 181;
        System.out.println(num >> 2);

        // left shift
        int nums = 61;
        System.out.println(nums << 1);




    }
}
