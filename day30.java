package days.of.coding;

import java.util.Scanner;

public class day30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai batas atas: ");
        int batasAtas = input.nextInt();
        
        int total = 0;
        for (int i = 1; i<= batasAtas; i++) {
            total += i; //dieksekusi sampai hingga pada batas atas yang ditentukan pada ssat diinput
        }

        System.out.println("Total penjumlahan  " + batasAtas + " adalah: " + total);

        input.close();
    }
}
        
   
