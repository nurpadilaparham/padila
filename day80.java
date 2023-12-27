package days.of.coding;

public class day80 {
    public static void main(String[] args) {
        //membuat program array multi dimensi
        int[][] matrix = new int[3][4]; //membuat array2D dengan nma matrix, 3 baris dan 4 kolom

        for (int i = 0; i < matrix.length; i++) {//menggunakan perulangan for selama i kurang dari panjang atau jumlah baris dalam matrix
            for (int j = 0; j < matrix[i].length; j++) {//meggunakan perulangan for selama nilai j kurang dari atau jumlah elemen dalam matrix
                matrix[i][j] = i + j; //mengisi nilai baris dan kolom dalam  array matrix 
            }
        }

        System.out.println("Isi array multi dimensi:");//mencetak isi array multi dimensi
        for (int i = 0; i < matrix.length; i++) {//menggunakan perulangan for selama i kurang dari panjang atau jumlah baris dalam matrix
            for (int j = 0; j < matrix[i].length; j++) {//meggunakan perulangan for selama nilai j kurang dari atau jumlah elemen dalam matrix
                System.out.print(matrix[i][j] + " ");//mencetak isi matriks baris dan kolomnya
            }
            System.out.println();
        }
    }
}

