package days.of.coding;

import java.util.Scanner;

public class day20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nilai awal: ");
        double nilaiAwal = input.nextDouble();

        System.out.print("Nilai akhir: ");
        double nilaiAkhir = input.nextDouble();

        double selisih = nilaiAkhir - nilaiAwal;
        double perubahan = (selisih / nilaiAwal) * 100;

        System.out.println("Selisih nilai: " + selisih);
        System.out.println("Persentase perubahan: " + perubahan + "%");

        input.close();
    }
}
