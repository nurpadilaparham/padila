package days.of.coding;

import java.util.Scanner;

public class day88 {
    public static void main(String[] args) {
        Scanner pdl = new Scanner(System.in);//membuat objek scanner pdl

        String[] makan = {"Rujak", "Siomai", "Tahu isi", "Martabak", "Kapurung"};//membuat array makanan

        int[] jumlahBeli = new int[makan.length];//mengambil nilai dalam makan sesuai panjangnya dan disimpan dalam variabel jumlahBeli

        for (int i = 0; i < makan.length; i++) {//menggunakan perulangan for dimana selama nilai i kurang dari banyaknya elemen dalam array maka perulangan terus berlanjut
            System.out.print("Masukkan jumlah " + makan[i] + " yang akan dibeli: ");//mencetak perintah memasukkan banyaknya makanan tersebut akan dibeli
            jumlahBeli[i] = pdl.nextInt();//nilai yang diinput itu nantinya akan tersimpan dalam variabel jumlahbeli
        }

        System.out.println("\nDaftar makanan yang Akan Dibeli:");//mencetak daftar makanan yang akan dibeli
        for (int i = 0; i < makan.length; i++) {//menggunakan perulangan for dimana selama i kurang dari panjang array
            if (jumlahBeli[i] > 0) {//Jika nilai jumlah makan yang akan dibeli lebih dari 0
                System.out.println(makan[i] + ": " + jumlahBeli[i] + " makan");//maka akan mencetak makanan sesuai indeks beserta dengan jumlah yang akan dibeli
            }
        }
    }
}