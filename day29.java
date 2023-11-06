package days.of.coding;

import java.util.Scanner;

public class day29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        int jumlahAngka = 0;
        
       // if (angka < 0) {
           // System.out.println();
       // } else {
            for (int i = 1; i <= angka; i++) {
                
                if (i % 3 == 0) {
                    System.out.println(i);
                }
 
                
            }
           // System.out.println("jumlah yang habis dibagi dari" + angka + " adalah " + jumlahAngka);
        }
    }       
