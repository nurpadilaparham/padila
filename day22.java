package days.of.coding;

import java.util.Scanner;

public class day22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jumlahNilai = 0;
        int totalNilai = 0; 
        
        System.out.println("Masukkan nilai-nilai (masukkan angka 0 untuk mengakhiri):");
        
        int nilai = input.nextInt();
        while (nilai != 0) {
            totalNilai += nilai;
            jumlahNilai++;
            nilai = input.nextInt();
        }
        
        input.close();
        
        if (jumlahNilai > 0) {
            double rataRata = (double) totalNilai / jumlahNilai;
            System.out.println("Rata-rata nilai: " + rataRata);
        } else {
            System.out.println("Tidak ada nilai yang dimasukkan.");
        }
    }
}