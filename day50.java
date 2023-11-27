package days.of.coding;

import java.util.Scanner;

public class day50 {
    public static void main(String[] args) {
        // Membuat objek Scanner yang bernama pdl agar bisa di input nnti
        Scanner pdl = new Scanner(System.in);

        // mencetak perintah untuk memasukkan bilangan yang akan dilihat bilangan ganjilnya nanti
        System.out.print("Masukkan bilangan: ");
        // kemudian yang diinputkan dan dibaca oleh scanner pdl akan disimpan dalam variabel yang bernama bilangan
        int bilangan = pdl.nextInt(); 

        // Inisialisasi variabel i diasumsikan dengan nilai 1
        int i = 1;

        // Mencetak kalimat deret bilangan ganjil hingga pada bilangan yang kita inputkan
        System.out.println("Deret bilangan ganjil hingga " + bilangan + ":");
        // menggunakan perulangan while dimana jika nilai dari variabel i kurang dari atau samadengan nilai dari bilangan
        while (i <= bilangan) {
            //mencetak nilai i dengan diikuti deret bilangannya
            System.out.print(i + " ");
            //bilngan akan terus bertambah 2 setiap iterasi, misalnya nilai i tadi = 1 maka nilai i selanjutnya adalah 3, 5, 7 dst
            i += 2; 
        }

        // Menutup objek Scanner pdl
        pdl.close();
    }
}

