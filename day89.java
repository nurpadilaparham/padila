package days.of.coding;

import java.util.Scanner;

public class day89 {
    public static void main(String[] args) {
        //program if else yang dimana menginputkan sebuah id dan dikenali atau tidak dikenali, jika dikenali maka akan diizinkan memasuki ruangan, jika tidak dikenali maka akses ditolak
        String idKu = "123456";//membuat id yang akan dikenali nantinya id yang saya buat 123456

        Scanner pdl = new Scanner(System.in);//membuat objek scanner agar inputan berfungsi
        System.out.print("Masukkan ID Anda: ");//mencetak perintah untuk memasukkan atau menginputkan id
        String inputId = pdl.nextLine();//nilai yang diinput disimpan dalam variabel inputId

        if (inputId.equals(idKu)) {//menggunakan if else dimana jika kondisi sesuai dengan apa yang diinputkan mka akan mencetak
            System.out.println("ID dikenali. Anda diizinkan memasuki ruangan.");//id dikenali dan diizinkan memasuki ruangan
        } else {
            System.out.println("ID tidak dikenali. Akses ditolak.");//jika kondisi tidak terpenuhi maka yang akan muncul adalah id tidak dikenali dan akses ditolak
        }
    }
}