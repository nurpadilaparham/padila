package days.of.coding;

import java.util.LinkedList;

public class day82 {
    public static void main(String[] args) {
        LinkedList<String> kelas = new LinkedList<>();//membuat obejk linked list dengan nama kelas

        kelas.add("Informatika A");//menambahkan 3 elemen ke dalam variabel kelas
        kelas.add("Informatika B");
        kelas.add("Informatika C");

        System.out.println("Sebelum perubahan : " + kelas);//mencetak elemen dalam kelas sebelum perubahan

        String elemenAkhir = kelas.pollLast();//memanggil metode kelas dan menyimpannya dalam elemenAkhir

        System.out.println("Elemen yang dihapus: " + elemenAkhir);//mencetak elemen akhir yang dihapus

        System.out.println("Setelah Perubahan : " + kelas);//mencetak elemen dalam variabel kelas setelah perubahan atau penghapusan
    }
}
