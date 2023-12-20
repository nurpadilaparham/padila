package days.of.coding;
 
import java.util.Scanner;

public class day73 {
    public static void main(String[] args) {
        //disini saya menggunakan scanner untuk membaca inputan namanya saya beri pdl
        Scanner pdl = new Scanner(System.in);
        System.out.print("Masukkan nilai 1: ");//mencetak perintah memasukkan nilai
        int nilai1 = pdl.nextInt();// mengambil inputan dan disimpan dalam variabel nilai1
        
        System.out.print("Masukkan nilai 2: ");//mencetak perintah memasukkan nilai 2
        int nilai2 = pdl.nextInt();//mengambil inputan dan disimpan dalam variabel nilai2
        
        int hasil = 0; //variabel hasil dengan nilai awal 0 
        if (nilai1 % 2 == 0 && nilai2 % 2 == 0) {//jika nilai 1 dan dua habis dibagi 2 maka 
            hasil = nilai1 + nilai2 + 5;//maka kedua nilai dijumlahkan dan ditambahkan setiap 5 
            System.out.println("hasil penjumlahan genap = " + hasil);   //mencetak hasil penjumlahan jika bilangannya genap
        }else if(nilai1 % 2 != 0 && nilai2 % 2 != 0) {//atau jika nilai1 dan nilai2 tidak habis dibagi 2 maka  
            hasil = nilai1 + nilai2 + 10;//nilai1 dan 2 dijumlahkan dan ditambahkan 10
            System.out.println("hasil penjumlahan ganjil = " + hasil );//mencetak hasil penjumlahan jika bilangannya ganjil
        }

    pdl.close();
    }
}
