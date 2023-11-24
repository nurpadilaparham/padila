package days.of.coding;

import java.util.Scanner;

public class day47 {
    public static void main(String[] args) {
        Scanner pdl = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int nl = pdl.nextInt();

        int[] arr = new int[nl];

        int i = 0;
        while (i < nl) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            arr[i] = pdl.nextInt();
            i++;
        }

        int sum = 0;
        i = 0;
        while (i < nl) {
            sum += arr[i];
            i++;
        }
        
        System.out.println("\nJumlah elemen array: " + sum);

        pdl.close();
    }
}
