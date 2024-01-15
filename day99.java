package days.of.coding;

import java.util.ArrayList;

public class day99 {
    public static void main(String[] args) {
        //program memeriksa apakah arraylist kosong atau tidak, jika ya maka akan mencetak true, jika tidak maka akan mencetak
        ArrayList<String> namaku = new ArrayList<>();// Membuat objek arraylist namaku
 
        boolean kosong = namaku.isEmpty();// Memeriksa apakah array list kosong atau tidak
        System.out.println("Array list kosong? " + kosong);//mencetak arraylist kosong? jika kosong maka akan muncul array list kosong? true

        namaku.add("Padila");// Menambahkan elemen ke array list ke dalam variabel namaku 

        kosong = namaku.isEmpty();//memeriksa lagi apakah arraylist masih kosong atau tidak
        System.out.println("Array list kosong? " + kosong);//mencetak arraylist kosong? jika sudah ada isi maka akan mencetak false
    }
}