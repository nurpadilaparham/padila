package days.of.coding;

import java.util.Scanner;

public class day17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan usia Anda: ");
        int usia = input.nextInt();

        if (usia >= 12) {
            System.out.println("Anda boleh menaiki wahana.");
        } else {
            System.out.println("Maaf, Anda belum cukup umur untuk menaiki wahana.");
        }

        input.close();
    }
}