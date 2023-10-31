package days.of.coding;

import java.util.Scanner;

public class day23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan penilaian terhadap kinerja karyawan (1-5): ");
        int skorKinerja = scanner.nextInt();

        String jenisBonus = "";

        switch (skorKinerja) {
            case 5:
                jenisBonus = "Bonus Besar";
                break;
            case 4:
                jenisBonus = "Bonus Sedang";
                break;
            case 3:
                jenisBonus = "Bonus Kecil";
                break;
            default:
                jenisBonus = "Tidak Ada Bonus";
        }

        System.out.println(jenisBonus + " Untuk Karyawan ");

        scanner.close();
    }
}