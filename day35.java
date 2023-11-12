package days.of.coding;

import java.util.ArrayList;

public class day35 {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan nama-nama buah
        ArrayList<String> namaBuah = new ArrayList<>();

        // Menambahkan beberapa nama buah
        namaBuah.add("pisang");
        namaBuah.add("kedondong");
        namaBuah.add("Mangga");

        // Menampilkan nama-nama buah
        System.out.println("Nama-nama Buah:");
        for (String buah : namaBuah) {
            System.out.println(buah);
        }
    }
}