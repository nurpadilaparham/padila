package days.of.coding;

import java.util.Scanner;

public class day54 {
    public static void main(String[] args) {
        // Membuat objek Scanner bernama pdl untuk input 
        Scanner pdl = new Scanner(System.in);

        
        System.out.print("Masukkan jenis buah: "); // mencetak perintah untuk menginputkan nama buah
        String jenisBuah = pdl.nextLine().toLowerCase(); 
        // (toLowerCase)berfungsi Mengubah input menjadi huruf kecil ketika kita menginputkan nama buahnya ada huruf kapital atau huruf kapital smua
        //agar ketika kita menginput dengan huruf kapital atau kecil program tidak eror

        // Menggunakan percabangan if-else if-else if-else 
        if (jenisBuah.equals("semangka")) {
            System.out.println("Buah ini adalah semangka.");
        } else if (jenisBuah.equals("pisang")) {
            System.out.println("Buah ini adalah pisang.");
        } else if (jenisBuah.equals("mangga")) {
            System.out.println("Buah ini adalah mangga.");
        } else {
            System.out.println("Buah tidak dikenali, silahkan ulangi.");
        }

        // Menutup objek Scanner pdl
        pdl.close();
    }
}
