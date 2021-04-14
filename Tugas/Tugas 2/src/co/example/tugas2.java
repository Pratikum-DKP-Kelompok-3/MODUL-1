package co.example;
import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        System.out.println("Kelompok: kelompok 3");
        System.out.println("Shift: shift 1");
        System.out.println("Nama Anggota 1: Ananda Muhammad Zahir (21120120140115)");
        System.out.println("Nama Anggota 2: Didan Hasan Murtaqi (21120120140103)");
        System.out.println("Nama Anggota 3: Juliant Raffa (21120120130127)");
        System.out.println("Nama Anggota 4: Sachiko Fitria Ramandanti (21120120140103)\n");

        char y;
        boolean con = false;
        do {
            System.out.println("==========================");
            System.out.println("PROGRAM MENAMPILKAN MATRIX");
            System.out.println("==========================");
            Scanner scan = new Scanner(System.in);
            System.out.print("Masukan Jumlah Baris: ");
            int baris = scan.nextInt();
            System.out.print("Masukan Jumlah Kolom: ");
            int kolom = scan.nextInt();
            //Deklarasi matrix
            int[][] matrix = new int[baris][kolom];
            //input data matrix
            enterMatrixData(scan, matrix, baris, kolom);
            //tampilkan matrix
            printMatrix(matrix, baris, kolom);
            System.out.print("Ingin Melanjutan?(y/t) ");
            y = scan.next().charAt(0);
            if (y == 'y' || y == 'Y' ){
                con = true;
            }else if (y == 't' || y =='T'){
                con = false;
            }else {
                con = false;
            }
            ;
        }while (con);
    }
    public static void enterMatrixData(Scanner scan, int[][] matrix, int baris, int kolom){
        System.out.println("Masukan Angka Pada Matrix: ");
        for (int i = 0; i < baris; i++){
            for (int j = 0; j < kolom; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
    }public static void printMatrix(int[][] matrix, int baris, int kolom){
        System.out.println("Matrix: ");
        for (int i = 0; i < baris; i++) {
            System.out.print("[");
            for  (int j = 0; j < kolom; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
