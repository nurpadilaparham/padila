package days.of.coding;

import java.util.Scanner;

public class day24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Apakah cuaca cerah? (ya/tidak): ");
        String cuacaCerah = input.next();
        System.out.print("Apakah sudah sore? (ya/tidak): ");
        String sudahSore = input.next();

        boolean cuacaBaik = cuacaCerah.equalsIgnoreCase("ya");
        boolean sore = sudahSore.equalsIgnoreCase("ya");

        if (cuacaBaik && sore) {
            System.out.println("Cuaca cerah dan sudah sore, saatnya jogging!");
        } else if (cuacaBaik && !sore) {
            System.out.println("Cuaca cerah, tapi masih siang, tunggu sore untuk jogging.");
        } else if (!cuacaBaik && sore) {
            System.out.println("Cuaca tidak cerah, tapi sudah sore, mungkin sebaiknya tidak jogging.");
        } else {
            System.out.println("Cuaca tidak cerah dan masih siang, tunggu sore dan cuaca cerah untuk jogging.");
        }
    }
}