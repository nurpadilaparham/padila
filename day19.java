package days.of.coding;

import java.util.Scanner;

public class day19 {
    public static void main(String[] args) {

        // Membuat objek Scanner untuk input dari pengguna
        Scanner inputScanner = new Scanner(System.in);

        // Meminta memasukkan jari-jari lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = inputScanner.nextDouble();
        
        //hitug
        double luas = Math.PI * jariJari * jariJari;
        double keliling = 2 * Math.PI * jariJari;

        System.out.println("Luas lingkaran: " + luas);
        System.out.println("Keliling lingkaran: " + keliling);

        // Menutup objek Scanner
        inputScanner.close();
    }
}
