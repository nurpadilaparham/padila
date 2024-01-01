package days.of.coding;

import java.util.Scanner;

public class day85 {
    public static void main(String[] args) {
        //membuat program yang menentukan jenis segitiga
        Scanner pdl = new Scanner(System.in);//membuat objek scanner dengan nama pdl agar inputan berfungsi

        System.out.print("Masukkan panjang sisi A: ");//mencetak perintah untuk memasukkan panjag sisi A
        double sisiA = pdl.nextDouble();//membaca inputan sisi A dan menyimpannya dalam variabel sisiA

        System.out.print("Masukkan panjang sisi B: ");//mencetak perintah untuk memasukkan panjag sisi B
        double sisiB = pdl.nextDouble();//membaca inputan sisi B dan menyimpannya dalam variabel sisi B

        System.out.print("Masukkan panjang sisi C: ");//mencetak perintah untuk memasukkan panjag sisi C
        double sisiC = pdl.nextDouble();//membaca inputan sisi C dan menyimpannya dalam variabel sisiC

        if (sisiA == sisiB && sisiB == sisiC) {//menggunakan percabangan if else, dimana jika sisi A sama dengan sisi B dan sisi B sama dengan sisi C
            System.out.println("Segitiga sama sisi");//akan mencetak segitga sama sisi
        } else if (sisiA == sisiB || sisiB == sisiC || sisiA == sisiC) {//atau jika sisi A sama dengan sisi B atau sisi B sama dengan sisi C atau sisi a sama dengan sisi C 
            System.out.println("Segitiga sama kaki");//maka akan mencetak segitiga sama kaki
        } else {
            System.out.println("Segitiga sembarang");//selain dari pada kondisi tersebut maka akan mencetak atau termasuk segitiga sembarang
        }
    }
}