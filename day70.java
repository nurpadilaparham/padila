package days.of.coding;

import java.util.Scanner;

public class day70 {
    public static void main(String[] args) {
        //program operator logika rentang nilai yang diizinkan
        //membuat objek scanner yang bernama pdl, agar sebuah inputan berfungsi dan disimpan dalam objek scanner
        Scanner pdl = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");//mencetak perintah untuk memasukkan nilai
        int nilai = pdl.nextInt();//membaca anilai yang kita input kemudian disimpan dalam variabel nilai

        // menggunakan percabangan if else memeriksa apakah nilai berada di luar rentang 0 hingga 100 atau 200 hingga 300
        if (nilai < 0 || (nilai > 100 && nilai < 200) || nilai > 300) {
            System.out.println("Nilai berada di luar rentang nilai yang diizinkan.");//jika nilai yang diinput siatas 300 maka yang muncul adalah nilai berada diluar rentang nilai yang diizinkan
        } else {
            System.out.println("Nilai berada dalam rentang nilai yang diizinkan.");//selain dari pada itu maka nilai berada dalam rentang yang diizinkan
        }

        pdl.close();
    }
}
