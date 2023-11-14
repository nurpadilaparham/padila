package days.of.coding;

import java.util.Scanner;

public class day37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int angka = scanner.nextInt();

        if (angka == 2) {
            System.out.println("kosong");
        } else {
            for (int i = 3; i <= angka; i += 3) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
