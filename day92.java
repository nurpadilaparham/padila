package days.of.coding;

import java.util.Stack;

public class day92 {
    public static void main(String[] args) {
        Stack<String> kelas = new Stack<>();//membuat objek stack dengan nama kelas

        kelas.push("Inf A");//menambahkan 3 elemen ke dalam variabel kelas 
        kelas.push("Inf B");
        kelas.push("Inf C");

        System.out.println("Daftar Kelas: " + kelas);//mencetak semua elemen dalam kelas

        String hps = kelas.pop();//menghapus elemen akhir dalam kelas menggunakan pop() dan menyimpannya dalam variabel hps
        System.out.println("Elemen yang dihapus: " + hps);//mencetak elemen yang dihapus

        String dpn = kelas.peek();//mengambil elemen pertama menggunakan peek() dan menyimpannya dlam variabel dpn
        System.out.println("Elemen pertama : " + dpn);//mencetak elemen pertama

        System.out.println("Daftar kelas setelah Perubahan: " + kelas);//mencetak elemen dalam kelas setelah perubahan
    }
}