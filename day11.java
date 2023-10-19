package days.of.coding;

import java.util.Scanner;

public class day11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar menu makanan
        String[] menu = {"Nasi Goreng", "Nasi Campur", "Mie Pangsit + bakso", "Mie Bakso", "Ayam Lalapan"};
        int[] harga = {10000, 12000, 12000, 10000, 25000};

        // Jumlah minimum pemesanan
        int jumlahMinimum = 1;

        // Permintaan menu makanan
        System.out.println("===================================================");
        System.out.println("Menu makanan yang tersedia:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + 1 + ". " + menu[i] + " (Rp. " + harga[i] + ")");
        }
        System.out.println("===================================================");

        System.out.println("Masukkan nomor menu yang Anda pesan: ");
        int nomorMenu = scanner.nextInt();

        // Jumlah menu yang dipesan
        System.out.println("Masukkan jumlah menu yang Anda pesan: ");
        int jumlahPesanan = scanner.nextInt();
        System.out.println("-----------------------------------------------------");

        // Validasi jumlah pesanan
        if (jumlahPesanan < jumlahMinimum) {
            System.out.println("Jumlah pesanan tidak memenuhi syarat.");
            return;
        }

        // Menu yang dipesan
        String menuPesanan = menu[nomorMenu - 1];

        // Harga menu yang dipesan
        int hargaMenu = harga[nomorMenu - 1];

        // Total harga
        int totalHarga = hargaMenu * jumlahPesanan;

        // Tampilan hasil
        System.out.println("Menu yang dipesan: " + menuPesanan);
        System.out.println("Jumlah pesanan: " + jumlahPesanan);
        System.out.println("Harga menu: Rp. " + hargaMenu);
        System.out.println("Total harga: Rp. " + totalHarga);
        System.out.println("-----------------------------------------------------");
    }
}
