package days.of.coding;

import java.util.ArrayList;
import java.util.Scanner;

public class day74 {
    public static void main(String[] args) {
        Scanner pdl = new Scanner(System.in);//membuat objek Scanner pdl untuk agar input berguna
        ArrayList<Integer> nilaiList = new ArrayList<>(); // Membuat ArrayList untuk menyimpan nilai

        for (int i = 0; i < 10; i++) {//menggunakan perulangan selama i kurang dari 10 mka perulangan terus berlanjut
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");//mencetak perintah masukan nilai ke, sampai dengan panjang indeks 
            int nilai = pdl.nextInt();//scanner membaca yang diinputkan dan disimpan dalam variabel nilai
            nilaiList.add(nilai);//menambah isi nilaiList dan disimpan dalam variabel nilai
        }
        
        System.out.println("ArrayList sebelum dihapus: " + nilaiList);// Menampilkan isi ArrayList sebelum penghapusan

        if (nilaiList.size() >= 4) {// Menghapus nilai pada indeks ke-3 atau posisinya pada nomor 4
            nilaiList.remove(3);//menghapus
            System.out.println("Nilai arraylist ke 3 telah dihapus.");//mencetak
        } else {
            System.out.println("Tidak dapat menghapus nilai pada indeks ke-3. ArrayList tidak memiliki cukup elemen.");//mencetak
        }

        // Menampilkan isi ArrayList setelah penghapusan
        System.out.println("ArrayList setelah penghapusan: " + nilaiList);//cetak nilai baru
    }
}
