package days.of.coding;

import java.util.Stack;

public class day96 {
    public static void main(String[] args) {
        Stack<String> kelas = new Stack<>();//membuat objek stack yang bernama kelas 

        kelas.push("Inf A");//menambahkan elemen kedalam kelas
        kelas.push("Inf B");
        kelas.push("Inf C");
        kelas.push("Inf D");

        System.out.println("Isi Stack: " + kelas);//mencetak isi kelas

        String temukan = "Inf C";//mencari elemen menggunakan fungsi search()
        int cari = kelas.search(temukan);//variabel cari mengambil elemen dalam variabel kelas 

        if (cari != -1) {//jika nilai dalam variabel cari tidak sama dengan -1 maka dianggap false
            System.out.println("Elemen '" + temukan + "' ditemukan di indeks: " + cari);//maka akan mencetak elemen yang dicari di temukan di indeks yang sama dalam variabel cari
        } else {
            System.out.println("Elemen '" + temukan + "' tidak ditemukan dalam kelas");//selain dari pada itu maka yang dicetak elemen yang dicari tidak ditemukan dalam kelas 
        }
    }
}