package days.of.coding;

import java.util.Scanner;

public class day18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Selamat datang di Toko Campuran");
        System.out.println("Silahkan pilih yang ingin Anda beli:");
        System.out.println("1. Lemari");
        System.out.println("2. Kasur");
        System.out.println("3. Mesin cuci");
        System.out.print("Masukkan nomor pilihan Anda: ");
        
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Lemari. Harga: Rp. 750,000");
                break;
            case 2:
                System.out.println("Anda memilih Kasur. Harga: Rp. 1.250,000");
                break;
            case 3:
                System.out.println("Anda memilih Mesin Cuci. Harga: Rp. 1.150,000");
                break;
            default:
                System.out.println("Pilihan tidak valid. Mohon pilih nomor 1, 2, atau 3.");
                break;
        }
        
        input.close();
    }
}
