package days.of.coding;

import java.util.Scanner;

public class day86 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner pdl = new Scanner(System.in);//membuat objek scanner dengan nama pdl 

        System.out.print("Masukkan berat badan (kg): ");//mencetak perintah untuk memasukkan berat badan kg
        double bb = pdl.nextDouble();//nilai yang dimasukkan akan tersimpan dalam variabel bb

        System.out.print("Masukkan tinggi badan (cm): ");//mencetak perintah untuk memasukkan tinggi badan m
        double tb = pdl.nextDouble();//nilai yang dimasukkan akan tersimpan dalam variabel tb
        
        double tbM = tb / 100;//mengonversi nilai tinggi badan dari sentimeter ke meter

        double indeks = bb / (tbM * tbM);//menghitung indeks massa tubuh

        String kategori;//menentukan kategori sesuai indeks massa tubuh
        if (indeks < 150.0) {//pada kondisi pertama, jika indeksnya kurang dari  18.5 maka dikategorikan kurus
            kategori = "Kurus";
        } else if (indeks < 200.0) {//pada kondisi kedua, jika indeksnya kurang dari  24.9 maka dikategorikan ideal
            kategori = "Ideal";
        } else if (indeks < 250.0) {//pada kondisi pertama, jika indeksnya kurang dari  29.9 maka dikategorikan gemuk
            kategori = "Gemuk";
        } else {
            kategori = "Obesitas";//selain dari pada itu jika indeksnya diatas dari ketiga kondisi tersebut, maka dia termasuk kategori obesitas
        }

        System.out.println("Indeks Massa Tubuh : " + indeks);//mencetak indeks massa tubuh
        System.out.println("Kategori Indeks Massa Tubuh : " + kategori);//mencetak kategori massa tubuh
    }
}

