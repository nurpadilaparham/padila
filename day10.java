package days.of.coding;
import java.util.Scanner;

public class day10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan golongan karyawan: ");
        int golongan = scanner.nextInt();

        System.out.println("Masukkan lama kerja karyawan (tahun): ");
        int lamaKerja = scanner.nextInt();

        int gaji = 0;
        int bonus = 0;

        if (golongan == 1) {
            gaji = 4000000;
        } else if (golongan == 2) {
            gaji = 7000000;
        } else if (golongan == 3) {
            gaji = 10000000;
        } else {
            System.out.println("Golongan tidak tersedia");
        }

        if (lamaKerja > 5) {
            bonus = 100000 * lamaKerja;
        }

        int totalGaji = gaji + bonus;

        System.out.println("Total gaji karyawan: " + totalGaji);
    }
}

