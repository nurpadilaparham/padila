package days.of.coding;

import java.util.Scanner;

public class day15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        double hasil = angka1 + angka2;

        System.out.println("Hasil penjumlahan: " + hasil);

        input.close();
    }
}

