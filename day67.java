package days.of.coding;

public class day67 {
    public static void main(String[] args) {
        int[][] arrayku = {{1, 2, 3},//menggunakan array 2d, dimana nama arraynya adalah array ku dengan tipe integer
                          {4, 5, 6},//nilai dari arrayku ada 1 sampai dengan 9
                          {7, 8, 9}};

        // Menampilkan elemen array 2D
        for (int[] rowArrayku : arrayku) {//menggunakan perulangan for-each
            for (int nilai : rowArrayku) {
                System.out.print(nilai + " ");//mencetak nilai
            }
            System.out.println();
        }

        // Menghitung dan menampilkan jumlah elemen array 2D
        int total = 0; // variabel total nilai awalnya 0, nantinya untuk menyimpan total nilainya nanti
        for (int[] rowArrayku : arrayku) {//menggunakan perulangan for each
            for (int nilai : rowArrayku) {
                total += nilai;//vriabel total akan menyimpan nilai, lalu nilai dalam variabel total akan terus ditambahkan atau dijumlahkan setiap iterasi
            }
        }
        System.out.println("Total nilai arrayku: " + total);
    }
}


