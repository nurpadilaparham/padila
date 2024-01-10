package days.of.coding;

import java.util.HashSet;

public class day94 {
    public static void main(String[] args) {
        HashSet<String> kelas = new HashSet<>();//membuat objek kelas Menggunakan HashSet

        kelas.add("Inf A");//menambahkan elemen kedalam kelas
        kelas.add("Inf B");
        kelas.add("Inf C");
        kelas.add("Inf B"); // Jika ada elemen yang sama atau duplikat, maka elemen tidak akan ditambahkan

        System.out.println("Elemen HashSet: " + kelas);//mencetak elemen dalam kelas

        kelas.remove("Inf B");//menghapus elemen dalam kelas
        System.out.println("Setelah menghapus Inf B: " + kelas);//kemudian mencetak setelah penghapusan elemen tersebut

        System.out.println("Jumlah elemen dalam HashSet: " + kelas.size());//menghitung jumlah elemen dalam kelas
    }
}