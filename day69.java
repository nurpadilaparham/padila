package days.of.coding;

public class day69 {
    public static void main(String[] args) {
        // Membuat arrayku dengan nilainya 1-5
        int[] arrayKu = {1, 2, 3, 4, 5};

        // Mencetak elemen-elemen array sebelum perubahan dimana nilai yang muncul masih nilai awal
        System.out.println("Elemen-elemen array sebelum perubahan:");
        //menggunakan perulngan for dimana selama i kurang jdaari panjang elemen dalam veriabel arrayku maka perulangan akan tetap berjalan
        for (int i = 0; i < arrayKu.length; i++) {
            System.out.println(arrayKu[i]);
        }

        // Memperbarui atau merubah elemen-elemen array
        //menggunakan perulngan for dimana selama i kurang jdaari panjang elemen dalam veriabel arrayku maka perulangan akan tetap berjalan
        for (int i = 0; i < arrayKu.length; i++) {
            arrayKu[i] = arrayKu[i] * 5; //mengubah elemen array menjadi setiap nilainya dikalikan 5 
        }

        // Mencetak elemen-elemen array setelah perubahan
        System.out.println("\nElemen-elemen array setelah perubahan:");
        for (int i = 0; i < arrayKu.length; i++) {
            System.out.println(arrayKu[i]);
        }
    }
}
