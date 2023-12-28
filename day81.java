package days.of.coding;

import java.util.LinkedList;

public class day81 {
    public static void main(String[] args) {
        LinkedList<String> kelas = new LinkedList<>();//membuat objek linkedlist dengan nama kelas

        kelas.add("Inf A");//menambahkan 3 elemen ke dalam variabel kelas
        kelas.add("Inf B");
        kelas.add("Inf C");
        
        System.out.println("Sebelum Perubahan: " + kelas);//mencetak elemen dalam kelas sebelum perubahan
    
        String elemenPertama = kelas.pollFirst();//mengambil elemen pertama untuk dihapus dan menyimpannya dalam variabel elemenPertama
        System.out.println("Elemen Pertama yang dihapus : " + elemenPertama);//mencetak elemen pertama yang dihapus yaitu inf A
        System.out.println("Setelah Perubahan: " + kelas);//mencetak elemen dalam variabel kelas setelah perubbahan atau penghapusan
    }
}
