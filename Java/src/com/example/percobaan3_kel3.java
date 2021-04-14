package com.example;

public class percobaan3_kel3 {
    public static void main(String[] args) {
        String[][] array = {{"Nana","Mina","Sana","Rona",
                "Karina"},{"Bakso","Soto","Mie ayam", "Kare","Sop Ayam",}};
        System.out.println( "Makanan kesukaan " + array[0][0] +
                " adalah " + array[1][0] + ", dan " + array[1][2]);
        System.out.println( "Makanan kesukaan " + array[0][1] +
                " adalah " + array[1][1] + ", dan " + array[1][3]);
        System.out.println( "Makanan kesukaan " + array[0][2] +
                " adalah " + array[1][4] + ", dan " + array[1][1]);
        System.out.println( "Makanan kesukaan " + array[0][3] +
                " adalah " + array[1][3] + ", dan " + array[1][0]);
        System.out.println( "Makanan kesukaan " + array[0][4] +
                " adalah " + array[1][2] + ", dan " + array[1][4]);
    }
}
