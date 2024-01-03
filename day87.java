package days.of.coding;

import java.util.Scanner;

public class day87 {
    public static void main(String[] args) {
        Scanner pdl = new Scanner(System.in);//membuat objek scanner pdl

        System.out.print("Masukkan sks Anda: ");//mencetak perintah untuk memasukkan jumlah sks
        int sks = pdl.nextInt();//membaca sks yang diinput dan disimpan dalam variabel

        if (sks >= 110) {//menggunakan if else dimna jika sks lebih dari atau sama dengan 110 
            System.out.println("anda sudah bisa program mata kuliah KKN");//maka sudah bisa memprogram kkn
        } else {
            System.out.println("SKS anda tidak mencukupi, silahkan program matakuliah sampai mencukupi");//jika sks belum sampai 110 maka silahkan program makul lain
        }
    }
}