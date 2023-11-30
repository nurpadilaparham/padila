package days.of.coding;

import java.util.Scanner;

public class day53 {
    public static void main(String[] args) {
        Scanner pdl = new Scanner(System.in); //membuat objek scanner bernama pdl

        System.out.print("Masukkan angka pertama: "); //mencetak kalimat perintah
        double angka1 = pdl.nextDouble(); //scanner(pdl) membaca angka yang kita inputkan dan mengimpannya pada variabel angka1

        System.out.print("Masukkan angka kedua: "); //mencetak kalimat perintah
        double angka2 = pdl.nextDouble(); //scanner(pdl) membaca angka yang kita inputkan dan mengimpannya pada variabel angka2

        System.out.println("Pilih operasi:"); //mencetak perintah untuk memilih jenis operasi apa yang akan dipilih
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        int kalkulatorku = pdl.nextInt(); //scanner(pdl) membaca operasi yang kita pilih dan menyimpannya pada variabel "kalkulatorku"

        switch (kalkulatorku) { //menggunakan percabanfan scitch case
            case 1: //jika memilih operasi 1
                tambah(angka1, angka2); //maka yang diproses adalah penjumlahan
                break;
            case 2: //atau jika memilih operasi 2
                kurang(angka1, angka2); //maka yang diproses adalah pengurangan
                break;
            case 3: //atu jika memilih operasi 3
                kali(angka1, angka2); //maka yang diproses adalah pekalian
                break;
            case 4: //atau jika memilih operasi ke 4
                bagi(angka1, angka2); //maka yang diproses adalah pembagian
                break;
            default:
                System.out.println("Pilihan tidak valid"); //jika kita memasukkan angka diluar 1-4 mka yang muncul pesan kesalahan
        }

        pdl.close();
    }

    //operasi untuk penjumlahan
    private static void tambah(double a, double b) {
        System.out.println("Hasil penjumlahan: " + (a + b));
    }

    // operasi untuk pengurangan
    private static void kurang(double a, double b) {
        System.out.println("Hasil pengurangan: " + (a - b));
    }

    // operasi untuk perkalian
    private static void kali(double a, double b) {
        System.out.println("Hasil perkalian: " + (a * b));
    }

    // operasi untuk pembagian menggunakan percabangan if else
    private static void bagi(double a, double b) {
        if (b != 0) {
            System.out.println("Hasil pembagian: " + (a / b));
        } else {
            System.out.println("Tidak bisa dibagi oleh 0");
        }
    }
}
