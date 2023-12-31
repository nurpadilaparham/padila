package days.of.coding;

import java.util.Scanner;

public class day84 {
    public static void main(String[] args) {
        Scanner pdl = new Scanner(System.in);//membuat obejk scanner pdl

        System.out.println("Masukkan Nomor (1-3) Untuk Memilih Tempat Wisata : ");//mencetak perintah untuk memilih memasukkan angka dari 1 - 3 untuk memilih tempat wisata
        int wisata = pdl.nextInt();//membuat variabel wisata untuk menyimpan nilai yang diinput

        switch (wisata) {//menggunakan switch-case dimana pilihan pertama ada pantai dato, pilihan kedua ada pantai munu, pilihan ketiga villa andata
            case 1:
                System.out.println("Anda memilih Wisata Pantai Dato");
                break;
            case 2:
                System.out.println("Anda memilih Wisata Pantai Munu");
                break;
            case 3:
                System.out.println("Anda memilih Wisata Villa Andata");
                break;
            default:
                System.out.println("Pilihan tidak valid");//jika pilihan yang dimasukkan selain angka 1-3 maka yang muncul adalah pilihan tidak valid
        }
    }
}
