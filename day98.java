package days.of.coding;

import java.util.ArrayList;
import java.util.Collections;

public class day98 {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<>();//membuat objek arrayList dengan nama padila

        nama.add("padila");//menambahkan elemen kedalam nama
        nama.add("sila");
        nama.add("caca");
        nama.add("cicci");

        System.out.println("Daftar nama sebelum diurutkan:");//mencetak nama sebelum diurutkan
        printArrayList(nama);//mencetak arraylist

        String cari = "padila";
        int index = nama.indexOf(cari);//menggunakan indexOf untuk mencari elemen padila

        if (index != -1) {//jika nilai dalam variabel cari tidak sama dengan -1 maka dianggap false
            System.out.println("\n'" + cari + "' ditemukan pada indeks: " + index);//maka akan mencetak elemen yang dicari di temukan di indeks yang sama dalam variabel cari
        } else {
            System.out.println("\n'" + cari + "' tidak ditemukan dalam ArrayList.");//selain dari pada itu maka akan mencetak tidak ditemukan dalam arrraylist
        }

        String[] array = nama.toArray(new String[nama.size()]);// Menggunakan toArray() untuk mengonversi ArrayList menjadi array dan menghitung elemen dalam variabel nama

        Collections.sort(nama);// Menggunakan sort() untuk mengurutkan elemen dalam variabel nama

        System.out.println("\nArrayList setelah diurutkan:");// Mencetak ArrayList setelah diurutkan
        printArrayList(nama);
    }

    private static void printArrayList(ArrayList<String> nama) {//metode untuk menampilkan arrayList
        for (String element : nama) {
            System.out.println(element);
            
        }
    }
}
