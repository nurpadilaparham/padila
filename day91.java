package days.of.coding;

import java.util.LinkedList;
import java.util.Queue;

public class day91 {
    public static void main(String[] args) {
        Queue<String> kelas = new LinkedList<>();//membuat objek queue mwnggunakan linkedlist yang variabelnya bernama kelas

        kelas.offer("Inf A");//menambahkan 3 elemen kedalam kelas 
        kelas.offer("Inf B"); 
        kelas.offer("Inf C");

        System.out.println("Daftar Kelas: " + kelas);//mencetak daftar elemen yang ada di dalam kelas

        String hps = kelas.poll();//menghapus elemen dan mengambil elemen dari depan antrian dan disimpannya dalam variabel hps
        System.out.println("Elemen yang dihapus: " + hps);//menampilkan elemen apa yang akan dihapus 

        System.out.println("Setelah elemen di hapus: " + kelas);//

        String dpn = kelas.peek();//mengambil elemen depan tanpa menghapusnya dan disimpan dalam variabel dpn
        System.out.println("Elemen depan: " + dpn);//mencetak elemen depan

        System.out.println("elemen yang fix dalam daftar kelas: " + kelas);//mencetak elemen yang ada dalam kelas 
    }
} 