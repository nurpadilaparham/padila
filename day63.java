package days.of.coding;

import java.util.Scanner;

public class day63 {
    public static void main(String[] args) {
        Scanner pdl = new Scanner(System.in); //dsni saya membuat objek scanner dengan nama pdl agar inputan berfungsi
        
        System.out.print("Masukkan panjang array: "); //mencetak perintah memasukkan panjang array
        int panjangArray = pdl.nextInt();//menyimpan nilai dalam variabel panjangArray yang telah dibaca oleh scanner

        int[] angka = new int[panjangArray]; //variabel angka menyimpan nilai yang sama panjangnya dengan variabel panjangArray

        System.out.println("Masukkan elemen-elemen array:");//mencetak perintah untuk memasukkan elemen-elemen array sebanyak panjang array
        for (int i = 0; i < panjangArray; i++) { // i = 0, jika nilai 1 kurang dari panjang array maka perulangan akan terus berlanjut
            System.out.print("Elemen ke-" + i + ": "); //mencetak kata elemen ke mulai dari indeks 0 sampai engan panjng array
            angka[i] = pdl.nextInt();//kemudian nilai yang dibaca oleh scanner disimpan dalam variabel angka
        }

        System.out.println("\nIsi array:");//mencetak isi array
        for (int i = 0; i < panjangArray; i++) {//i = 0, jika nilai 1 kurang dari panjang array maka perulangan akan terus berlanjut
            System.out.print(angka[i] + " ");//mencetak nilai dalam variabel angka sesuai dari indeks awal sampai akhir
        }

        int nilaiPengurangan = 5;//nilai yang dikurangkan adalah nilai 5, misalnya pada elemen pertama adalah 15 maka hasil dari pengurangannya nanti adalah 10
        for (int i = 0; i < panjangArray; i++) {//i = 0, jika nilai 1 kurang dari panjang array maka perulangan akan terus berlanjut
            angka[i] -= nilaiPengurangan; //nilai dalam variabel angka pada indeks i akan dikurangkan dengan nilai dalam variabel nilai penguragan
        }

        System.out.println("\nHasil pengurangan:");//mencetak hasil pengurangan
        for (int i = 0; i < panjangArray; i++) {///i = 0, jika nilai 1 kurang dari panjang array maka perulangan akan terus berlanjut
            System.out.print(angka[i] + " ");//mencetak nilai hasil pengurangan pada variabel angka
        }

        pdl.close();//menutup objek scanner
    }
}

