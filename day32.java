package days.of.coding;

import java.util.Scanner;

public class day32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan suatu bilangan: ");
        int bilangan = scanner.nextInt();

        // Memeriksa apakah bilangan positif, negatif, atau nol
        if (bilangan > 0) {
            System.out.println("Bilangan positif");
        } else if (bilangan < 0) {
            System.out.println("Bilangan negatif");
        } else {
            System.out.println("Nol");
        }

        scanner.close();
    }
}