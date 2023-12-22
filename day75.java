package days.of.coding;

import java.util.Scanner;

public class day75 {
    public static void main(String[] args) {
        //dsni saya membuat program yang jikan nilai yang kita inputkan bilangan ganjil maka akan ditampilkan deret bilangan ganjilnya
        //tapi jika kita memasukka bilangan genap maka yang akan muncul adalah deretan bilangan genapnya
        Scanner pdl = new Scanner(System.in);//onjek scanner pdl untuk membaca inputan 

        System.out.print("Masukkan nilai: ");//mencetak perintah untuk memasukkan nilai
        int nilai = pdl.nextInt();//variabel nilai untuk menyimpan nilai yang kita input

        if (nilai % 2 == 0) {//menggunakan percabangan if else dimna didalam if ada perulangan for, dimana jika nilai habis dibagi 2 atau sama dengan 0 maka bilangan genap
            int genap = 0;//variabel yang menyimpan nilai deretan genap dengan nilai awal 0
            for (int i = 2; i <= nilai; i += 2) {//i  dengan nilai awal  2, dimana selama i kurang dari atau sama dengan nilai yang kita inputkan maka akan terus bertambah 2 
                genap += i;//nilai dalam variabel genap akan terus bertambah sampai pada nilai yang kita inputkan, misalnya kita input 6 maka yang mincul adalah genap = 12 karna hasil tambah 2 + 4 + 6
            }
            System.out.println("Genap = " + genap);//mencetak nilai genap
        } else {//selain dari pada itu adalah nilai ganjil
            int ganjil = 0;//variabel yang menyimpan nilai deretan ganjil dengan nilai awal 0
            for (int i = 1; i <= nilai; i += 2) {//i dengan nilai awal 1, dimana selama i masih kurang atau sama dengan nilai yang kita inputkan maka nilai akan terus bertambah 2
                ganjil += i;//nilai dalam variabel ganjil akan terus bertambah sampai pada nilai yang kita inputkan, misalnya kita input 5 maka yang mincul adalah ganjil = 9 karna hasil tambah 1 + 3 + 5 
            }
            System.out.println("Ganjil = " + ganjil);//mencetak nilai ganjil
        }
    }
}