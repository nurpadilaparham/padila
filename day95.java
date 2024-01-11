package days.of.coding;

import java.util.ArrayList;

public class day95 {
    public static void main(String[] args) {
        //ArrayList menggunakan tipe wrapper Integer
        ArrayList<Integer> nilai = new ArrayList<>();//membuat arrayList nama variabelnya nilai

        nilai.add(10);//menambahkan 4 elemen ke dalam variabel nilai
        nilai.add(11);
        nilai.add(12);
        nilai.add(13);

        System.out.println("Isi ArrayList:");//mencetak isi arraylist
        for (Integer nomor : nilai) {//menggunakan perulangan for, mengambil elemen  yang ada di nilai dan disimpan dalam variabel nomor
            System.out.println(nomor);//mencetak nilai dalam variabel nomor
        }
        nilai.remove(Integer.valueOf(12));//menghapus nilai 12 dalam elemen nilai
        System.out.println("Isi ArrayList setelah penghapusan:");//mencetak isi arrayList setelah penghapusan 
        for (Integer nomor : nilai) {//mengambil elemen yang baru dalam nilai dan menyimpannya dalam variabel nomor
            System.out.println(nomor);//mencetak elemen dalam nomor
        }
    }
}