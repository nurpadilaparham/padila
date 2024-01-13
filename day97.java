package days.of.coding;

import java.util.HashSet;

public class day97 {
    public static void main(String[] args) {
        HashSet<String> kelas = new HashSet<>();//membuat objek hashset dengan nama kelas

        kelas.add("inf A");// Menambahkan elemen ke dalam kelas
        kelas.add("inf B");
        kelas.add("inf C");
        kelas.add("inf D"); // Duplicat, tidak akan ditambahkan

        System.out.println("Daftar kelas: " + kelas);//mencetak semua daftar dalam kelas
        System.out.println("Apakah ada kelas 'inf B'? " + kelas.contains("inf B"));//menentukan apakah di dalam daftar kelas mengandung kelas inf B?
        System.out.println("Jumlah elemen dalam HashSet: " + kelas.size());//menghitung elemen dalam kelas

        kelas.clear();//menghapus semua elemen dalam kelas
        System.out.println("HashSet setelah penghapusan semua elemen: " + kelas);//mencetak elemen kelas setelah penghapusan
    }
}