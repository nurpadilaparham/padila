package days.of.coding;

import java.util.Scanner;

public class day25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total belanja: ");
        double totalBelanja = input.nextDouble();

        System.out.print("Masukkan diskon: ");
        double persentaseDiskon = input.nextDouble();
        double diskon = (persentaseDiskon / 100) * totalBelanja;

        double totalBayar = totalBelanja - diskon;

        System.out.println("Total belanja : " + totalBelanja);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total yang harus dibayar: " + totalBayar);

        input.close();
    }
}