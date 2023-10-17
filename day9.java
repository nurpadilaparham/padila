package days.of.coding;
import java.util.Scanner;


public class day9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih menu makanan:");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Bakso");
        System.out.println("4. Gado-gado");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Anda memesan Nasi Goreng. Silakan tunggu pesanan Anda.");
                break;
            case 2:
                System.out.println("Anda memesan Mie Ayam. Silakan tunggu pesanan Anda.");
                break;
            case 3:
                System.out.println("Anda memesan Bakso. Silakan tunggu pesanan Anda.");
                break;
            case 4:
                System.out.println("Anda memesan Gado-gado. Silakan tunggu pesanan Anda.");
                break;
            default:
                System.out.println("Menu yang Anda pilih tidak tersedia.");
                break;
        }
        scanner.close();
    }
}
