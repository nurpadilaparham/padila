package days.of.coding;

import java.util.LinkedList;

public class day90 {
    public static void main(String[] args) {
        LinkedList<String> kelas = new LinkedList<>();//membuat linkedlist yng saya namai kelas

        kelas.offer("Informatika B");//menambahkan 3 elemen kedalam kelas 
        kelas.offer("Informatika C");
        kelas.offer("Informatika D");

        kelas.offerFirst("Informatika A");//menambahkan elemen awal informati A menggunakan offerFirst()

        kelas.offerLast("Informatika E");//menggunakan elemen akhir informatika E menggunakan offerLast()

        System.out.println("Daftar Kelas: " + kelas);//mencetak semua elemen dalam kelas

    }
}
