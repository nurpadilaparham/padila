package days.of.coding;

public class day71 {
    public static void main(String[] args) {
        //disini saya membuat program array yang mencetak 2 array antara integer dan string
        //array integer yang saya beri nama nomorku
        int[] nomorku = {1, 2, 3, 4, 5};

        // Memanggil metode untuk menampilkan isi array
        cetak(nomorku);

        //dsin saya membuat array string yang saya beri nama buahku 
        String[] buahku = {"pisang", "Nangka", "Rambutan", "Durian"};

        // Memanggil metode untuk menampilkan isi array
        cetak(buahku);
    }

    //untuk menampilkan isi array integer
    public static void cetak(int[] arr) {
        System.out.print("array integer: ");//mencetak array integer
        for (int nomorku : arr) {//menggunakan perulangan for each
            System.out.print(nomorku + " ");//mencetak nilai dalam variabel nomorku
        }
        System.out.println();
    }

    //untuk menampilkan isi array string
    public static void cetak(String[] arr) {
        System.out.print("array string: ");//mencetak array string
        for (String buahku : arr) {//menggunakan perulangan for each
            System.out.print(buahku + " ");//mencetak nilai dalam variabel buahku
        }
        System.out.println();
    }
}
