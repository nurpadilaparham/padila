package days.of.coding;

import java.util.Scanner;

public class day26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

        long faktorial = 1;
        for (int i = 1; i <= bilangan; i++) {
            faktorial *= i;
        }

        System.out.println("Faktorial dari bilangan" + bilangan + " = " + faktorial);
    }
}