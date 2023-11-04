package days.of.coding;

import java.util.Scanner;

public class day27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriksA = new int[2][2];
        int[][] matriksB = new int[2][2];
        int[][] hasilPenjumlahan = new int[2][2];
        
        System.out.println("Masukkan Nilai Matriks A (2x2) : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriksA[i][j] = input.nextInt();
            }   
        }
        
        System.out.println("Masukkan Nilai Matriks B (2x2) : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriksB[i][j] = input.nextInt();                
            }            
        }
        
        // Melakukan penjumlahan matriks A dan B
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasilPenjumlahan[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }
        
        System.out.println("Hasil Penjumlahan Matriks A + B = ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(hasilPenjumlahan[i][j] + " ");
            }
            System.out.println();
        }          
    }
}
