package days.of.coding;

public class day62 {
    public static void main(String[] args) {
        // dua buah array yang masing-masing saya beri nama blngn1 dan blngn2
        int[] blngn1 = {1, 2, 3, 4, 5};
        int[] blngn2 = {3, 6, 1, 5, 10};

        int[] hasil = new int[blngn1.length]; // variabel array hasil, untuk menyimpan hasil penjumlahan

        // Melakukan operasi penambahan dan menyimpan hasilnya ke array hasil
        for (int i = 0; i < blngn1.length; i++) { //perulangan for, jika 1 kurang dari nilai dalam variabel blngn 1 maka perulangan akan terus berlanjut
            hasil[i] = blngn1[i] + blngn2[i]; //proses penjumlahan akan disimpan dalam variabel hasil
        }

        // Menacetak hasil penjumlahan dua array 
        System.out.print("Hasil penjumlahan array blngn1 dan blngn2 : ");
        for (int i = 0; i < hasil.length; i++) {
            System.out.print(hasil[i] + " ");
        }
    }
}
