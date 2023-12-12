package days.of.coding;

public class day65 {
    public static void main(String[] args) {
        int[][] arrayku = {//mendeklarasikann variabel array dengan tipe data integer ddimana array dimensi2d
            {1, 2, 3},//nilai yang ada dalam variabel arrayku
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Isi Array:"); //mencetak isi array
        printArrayku(arrayku);

        int aksesElemen = arrayku[1][2];//disini saya mengakses elemen baris 1 kolom 2dimana menunjukkan angka 6 
        System.out.println("\nElemen pada baris 1, kolom 2: " + aksesElemen);//mencetak elemen yang saya akses
    }

    public static void printArrayku(int[][] array) {
        for (int i = 0; i < array.length; i++) {//menggunakan perulangan for, dimana, selama i kurang dari panjang arrai maka perulangan akan terus berlanjut
            for (int j = 0; j < array[i].length; j++) {//selama j kurang dari panjang atau banyaknya indeks array maka perulangan akan terus berlanjut
                System.out.print(array[i][j] + " ");//mencetak baris dan kolom dari array yang diakses
            }
            System.out.println();
        }
    }
}
