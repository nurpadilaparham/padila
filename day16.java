package days.of.coding;

import java.util.Scanner;

public class day16 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan panjang sisi persegi
        System.out.print("Masukkan panjang sisi persegi: ");
        double sisi = input.nextDouble();

        // Menghitung keliling persegi
        double keliling = 4 * sisi;

        // Menampilkan hasil
        System.out.println("Keliling persegi dengan sisi " + sisi + " adalah " + keliling);

        // Menutup objek Scanner
        input.close();
    }
}