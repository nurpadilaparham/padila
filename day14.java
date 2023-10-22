package days.of.coding;

import java.util.Scanner;

public class day14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nomor dari daftar nama teman (1-7): ");
        int nama = scanner.nextInt();

        switch (nama) {
            case 1:
                System.out.println("padila");
                break;
            case 2:
                System.out.println("caca");
                break;
            case 3:
                System.out.println("sila");
                break;
            case 4:
                System.out.println("lisa");
                break;
            case 5:
                System.out.println("aisyah");
                break;
            case 6:
                System.out.println("madina");
                break;
            case 7:
                System.out.println("fitra");
                break;
            default:
                System.out.println("Bukan teman saya");
                break;
        }

        scanner.close();
    }
}

