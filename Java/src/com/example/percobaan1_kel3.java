package com.example;

import java.util.Scanner;

public class percobaan1_kel3 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.print( "Nama: " );
        String nama = input.next();
        System.out.print( "Umur: " );
        int umur = input.nextInt();
        System.out.println("Hello "+nama);
        System.out.println("Umur kamu : "+umur);
    }
}
