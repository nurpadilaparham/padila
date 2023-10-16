package days.of.coding;
import java.util.Scanner;

public class day8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai Anda: ");
        int nilai = input.nextInt();

        if (nilai >= 70) {
            System.out.println("Selamat, Anda Lulus!");
        } else {
            System.out.println("Maaf, Anda Belum Lulus.");
        }

        input.close();
    }
}

    
