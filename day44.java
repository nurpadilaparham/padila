package days.of.coding;

import java.util.Scanner;

public class day44 {

    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        int nilai;
        String nama,predikat;

        System.out.println("              Data mahasiswa            ");
        System.out.println("----------------------------------------");

        System.out.print("Masukkan nama mahasiswa   : ");
        nama = cc.nextLine();
        System.out.print("Masukkan nilai            : ");
        nilai = cc.nextInt();

        if (nilai >=80 ) {
            predikat = "A";

        } else if (nilai >=70 ){
            predikat = "B";

        } else if (nilai >=60 ){
            predikat = "C";

        } else if (nilai >=50){
            predikat = "D";

        } else {
            predikat = "E";
        }
        System.out.println("----------------------------------------");
        System.out.println("Nama     = " + nama);
        System.out.println("Nilai    = " + nilai);
        System.out.println("Predikat = " + predikat);
    }

}