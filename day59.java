package days.of.coding;

import java.util.Scanner;

public class day59 {
    public static void main(String[] args) {
        // Mendeklarasikan array dan menginisialisasinya
        int[] angka = {1, 2, 3, 4, 5};

        // Mencetak isi array
        System.out.print("Elemen-elemen array: ");
        for (int nmr : angka) {  // perulangan for untuk menampilkan setiap elemen array
            System.out.print(nmr + " ");
        }
        System.out.println();

        // Membaca input dari pengguna
        Scanner pdl = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int inputPengguna = pdl.nextInt();

        // Mengecek apakah angka yang dimasukkan oleh pengguna ada di dalam array
        boolean ditemukan = false;
        for (int num : angka) {  // perulangan for untuk memeriksa setiap elemen array
            if (num == inputPengguna) { // jika nilai pada array sama dengan apa yang diinputkan nanti, maka ditemukan
                ditemukan = true;
                break;
            }
        }

        // Menampilkan hasil berdasarkan percabangan
        //disini ada 2 kondisi, jika ditemukan maka akan muncul angka yang dimasukkan bersamaan dengan kalimat, "ditemukan dalam array
        if (ditemukan) {  // Percabangan if-else untuk menampilkan hasil
            System.out.println(inputPengguna + " ditemukan dalam array.");
        //tapi, selain daripada itu maka yang muncul adalah angka yang dimasukkan bersamaan dengan kalimat, "tidak ditemukan dalam array
        } else {
            System.out.println(inputPengguna + " tidak ditemukan dalam array.");
        }
    }
}
