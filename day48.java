package days.of.coding;

import java.util.Scanner;

public class day48 {
    public static void main(String[] args) {
        Scanner pdl = new Scanner(System.in);

        System.out.println("Daftar Matakuliah Tambahan");
        System.out.println("1. Pemrograman Berbasis Objek");
        System.out.println("2. Dasar-dasar Pemrograman");
        System.out.println("3. Basis Data");
        System.out.println("4. Pemrograman Game");

        System.out.print("Masukkan matakuliah yang akan anda program (1-4): ");
        int padila = pdl.nextInt();

        switch (padila) {
            case 1:
                System.out.println("Anda memilih matakuliah Pemrograman Berbasis Objek.");
                break;
            case 2:
                System.out.println("Anda memilih matakuliah Dasar-dasar Pemrograman.");
                break;
            case 3:
                System.out.println("Anda memilih matakuliah Basis Data .");
                break;
            case 4:
                System.out.println("Anda memilih matakuliah Pemrograman Game.");
                break;
            default:
                System.out.println("Pilihan tidak ada. silahkan pilih yang tertera diatas.");
                break;
        }

        pdl.close();
    }
}