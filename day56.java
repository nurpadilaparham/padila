package days.of.coding;

import java.util.LinkedList;

public class day56 {
    public static void main(String[] args) {
        // Membuat objek LinkedList yang saya beri nama pdl
        LinkedList<String> pdl = new LinkedList<>();

        // Menambahkan elemen ke LinkedList
        pdl.add("Merah");
        pdl.add("Kuning");
        pdl.add("Hijau");
        pdl.add("pink");

        // Mencetak elemen-elemen yang ada di dalam LinkedList
        System.out.println("Element-elemen yang ada di linkedlist: " + pdl);

        // Menambahkan elemen baru indeks ke 1 pada linkedlist
        pdl.add(1, "Biru");

        // Mencetak elemen-elemen setelah penambahan
        System.out.println("Menambahkan elemen baru 'biru' pada indeks 1: " + pdl);

        // Menghapus elemen indeks ke 2 pada linkedlist
        pdl.remove(2);

        // Mencetak elemen-elemen setelah penghapusan
        System.out.println("Setelah penghapusan elemen indeks 2 padaa linkedlist: " + pdl);

        // Mengakses dan mencetak elemen pada indeks ke 0
        String warnaku = pdl.get(0);
        System.out.println("Elemen index ke-0 adalah warna: " + warnaku);
    }
}

