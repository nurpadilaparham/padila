package days.of.coding;

import java.util.ArrayList;

public class day33 {
    public static void main(String[] args) {
        ArrayList<String> daftarMhs = new ArrayList<>();

        // Menambahkan nama-nama mahasiswa ke ArrayList
        daftarMhs.add("NURPADILA");
        daftarMhs.add("NAZILA MANSUR");
        daftarMhs.add("TASYA WAHDINI");
        daftarMhs.add("NURHALISA");

        // Menampilkan daftar mahasiswa
        System.out.println("Daftar Mahasiswa:");
        for (String mahasiswa : daftarMhs) {
            System.out.println("- " + mahasiswa);
        }

        // Menghapus salah satu mahasiswa dari ArrayList
        daftarMhs.remove("TASYA WAHDINI");

        // Menampilkan daftar mahasiswa setelah penghapusan
        System.out.println("\nDaftar Mahasiswa setelah Penghapusan:");
        for (String mahasiswa : daftarMhs) {
            System.out.println("- " + mahasiswa);
        }
    }
}