package days.of.coding;

import java.util.Scanner;

public class day57 {
    public static void main(String[] args) {
        // Mendeklarasikan array untuk menyimpan data siswa
        String[] namaSiswa = new String[3];
        int[] nilaiSiswa = new int[3];

        // Mengisi data siswa melalui input yang kita masukkan pada outputnya nanti
        Scanner pdl = new Scanner(System.in);
        for (int i = 0; i < namaSiswa.length; i++) {
            // mencetak perintah yang Meminta nama siswa dari pengguna
            System.out.print("Masukkan nama siswa " + (i + 1) + ": ");
            namaSiswa[i] = pdl.nextLine();

            // mencetak perintah yang Meminta nilai siswa dari pengguna
            System.out.print("Masukkan nilai untuk siswa " + (i + 1) + ": ");

            // Validasi input untuk memastikan nilai berupa angka
            while (!pdl.hasNextInt()) {
                System.out.println("Input tidak valid! Masukkan nilai yang valid.");
                pdl.nextLine();  // Membersihkan buffer
            }
            nilaiSiswa[i] = pdl.nextInt();
            pdl.nextLine();  // Membersihkan buffer

            System.out.println();  // Spasi antara setiap input siswa
        }

        // Menampilkan data siswa
        System.out.println("Data Siswa:");
        for (int i = 0; i < namaSiswa.length; i++) { //perulangan for selama nilai i lebih kecil dari jumlah nilai pada variabel namaSiswa maka perulangan kana terus berlanjut
            System.out.println("Nama: " + namaSiswa[i] + ", Nilai: " + nilaiSiswa[i]);
        }

        // Menghitung rata-rata nilai siswa
        double rataNilai = hitungRata(nilaiSiswa); //
        System.out.println("Rata-rata Nilai: " + rataNilai);

        // Mencari siswa dengan nilai tertinggi
        String siswaTertinggi = cariSiswaTertinggi(namaSiswa, nilaiSiswa);
        System.out.println("Siswa Terbaik: " + siswaTertinggi);
    }

    // Metode untuk menghitung rata-rata nilai
    private static double hitungRata(int[] nilai) {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return (double) total / nilai.length;
    }

    // Metode untuk mencari siswa dengan nilai tertinggi
    private static String cariSiswaTertinggi(String[] nama, int[] nilai) {
        int nilaiTertinggi = nilai[0];
        int indeksTertinggi = 0;

        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
                indeksTertinggi = i;
            }
        }

        return nama[indeksTertinggi];
    }
}
