package days.of.coding;

import java.util.ArrayList;
import java.util.Scanner;

public class day76 {
    public static void main(String[] args) {
        //program array list yang bisa menginput data-data, dan memasukkan kata selesai jika ingin mengakhiri data
        Scanner pdl = new Scanner(System.in);//membuat objek scanner pdl agar inputan bisa digunakan

        ArrayList<String> data = new ArrayList<>();//membuat arraylist dengan nama variabel data

        System.out.println("Masukkan data (ketik 'selesai' untuk mengakhiri):");//mencetak perintah masukkan data dan ketik selesai untuk mengakhiri
        boolean selesai = false;//variabel selesai dngan tipe data boolean yang bernilai false
        while (!selesai) {//menggunakan perulangan while, selama nilainya false maka perulangan akan terus berlanjut
            System.out.print("Data : ");//mencetak data : 
            String datanya = pdl.nextLine();//variabel datanya untuk menyimpan nilai nilai yang kita inputkan

            if (datanya.equalsIgnoreCase("selesai")) {//menggunakan percabangan if else, menggunakan equalsIgnoreCase, agar huruf yang dimasukkan besar atau kecil tidak berpengaruh
                selesai = true;//ketika kita memasukkan selesai maka perulangan while tadi akan berhenti di eksekusi karna sdh tidak terpenuhi dan nilai pada variabel selesai berganti menjadi true
            } else {
                data.add(datanya);//ketika kita tidak menginput kata selesai maka perulangan akan terus berlanjut menginput data dan disimpan dalam variabel data
            }
        }

        System.out.println("\nData yang telah dimasukkan:");// mencetak data yang telah dimasukkan
        for (String datanya : data) {
            System.out.println(datanya);
        }
    }
}
