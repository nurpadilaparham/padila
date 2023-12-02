package days.of.coding;

import java.util.Vector;

public class day55 {  
    public static void main(String[] args) {  
        Vector<String> pdl = new Vector<>();  // Membuat objek Vector dengan tipe data String dengan nama pdl

        // Menambahkan elemen 
        pdl.add("pisang nuget");  // Menambahkan pisang nuget ke dalam Vector
        pdl.add("banana rol");  // Menambahkan banana rol ke dalam Vector
        pdl.add("pisang epe");  // Menambahkan pisang epe ke dalam Vector

        // Menampilkan elemen-elemen Vector
        System.out.println("Vector: " + pdl);

        //menghitung dan Mencetak ukuran Vector
        System.out.println("Ukuran Vector: " + pdl.size());

        // Mengakses elemen berdasarkan indeks
        String lapar = pdl.get(1);  // Mendapatkan elemen pada indeks 1
        System.out.println("Elemen pada indeks 1: " + lapar);

        // Menghapus elemen
        pdl.remove("pisang nuget");  // Menghapus "Elemen 2" dari dalam Vector
        System.out.println("Vector setelah menghapus 'pisang nuget': " + pdl);
    }
}
