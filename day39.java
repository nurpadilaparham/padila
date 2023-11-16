package days.of.coding;

import java.util.Scanner;

public class day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nomor (1-3): ");
        int daftarteman = input.nextInt();

        switch (daftarteman) {
            case 1:
                System.out.println("Tasya");
                break;
            case 2:
                System.out.println("Nazila");
                break;
            case 3:
                System.out.println("Lisa");
                break;
            default:
                System.out.println("Input tidak valid. Masukkan nomor pada daftar teman antara 1 sampai 3.");
        }

        input.close();
    }
}