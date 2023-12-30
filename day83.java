package days.of.coding;

import java.util.Scanner;

public class day83 {
    public static void main(String[] args) {
        Scanner pdl = new Scanner(System.in);//membuat objek scanner pdl

        System.out.print("Masukkan nilai: ");//mencetak perintah masukkan nilaai
        int nilai = pdl.nextInt();//membaca nilai yang diinputkan dan disimpan dalam variabel nilai

        char peringkat = (nilai >= 90) ? 'A' ://membuat variabel peringkat menggunakan operator ternary dimana nilai lebih atau sama dengan 90 itu mendapat A dan seterusnya
                         (nilai >= 80) ? 'B' :
                         (nilai >= 70) ? 'C' :
                         (nilai >= 60) ? 'D' : 'F';

        System.out.println("Nilai dari " + nilai + " adalah: " + peringkat);//mencetak nilai dari yang diinput dan sesua peringkat apa
    }
}

