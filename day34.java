package days.of.coding;

import java.util.Scanner;

public class day34 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Masukkan angka : ");
         int angka = input.nextInt();
         
         if (angka % 3 == 0 && angka % 5 == 0) {
             System.out.println("Master class");
         } else if (angka % 5 == 0) {
             System.out.println("Priode of 5");
         } else if (angka % 3  == 0){
             System.out.println("priode of 3");
         } else {
             System.out.println("Masukkan angka lain");
         }
    }
}
