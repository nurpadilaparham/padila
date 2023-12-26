package days.of.coding;

public class day79 {
    public static void main(String[] args) {
        //membuat array dengan menggunakan for-each
        int[] angkaKu = {1, 2, 3, 4, 5};//variabel array angkaKu dengan nilai 1 - 5

        System.out.println("Nilai dalam variabel angkaKu :");//mencetak kalimat nilai dalam variabel angkaku
        for (int angka : angkaKu) {//menggunakan for-each mengambil nilai dalam variabel angkaKu dan menyimpan kedalam variabel angka
            System.out.println(angka);//cetak nilai dlm variabel angka
        }
    }
}
