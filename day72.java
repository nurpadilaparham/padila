package days.of.coding;

public class day72 {
    public static void main(String[] args) {
        //disini saya membuat program array 3d dengan nama variabel arraynya adalah bilagan, dengan nilai pada lapisan pertama 1-9, lapisan kedua 11-19, lapisan ketiga 20-28
        int[][][] bilangan = {
            {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            },
            {
                {11, 12, 13},
                {14, 15, 16},
                {17, 18, 19}
            },
            {
                {20, 21, 22},
                {23, 24, 25},
                {26, 27, 28}
            }
        };

        System.out.println("Elemen array 3d:"); //mencetak elemen array 3d
        for (int i = 0; i < bilangan.length; i++) {//perulangan for, selama i atau lapisan kurang dari panjang nilai dalam variabel bilangan, maka perulangan akan terus berlanjut
            for (int j = 0; j < bilangan[i].length; j++) {// selama nilai j atau baris dalam lapisan kurang dari panjang nilai dalam variabel bilangan maka perulangan akan terus berlanjut
                for (int k = 0; k < bilangan[i][j].length; k++) {//selama nilai k atau kolom dalam lapisan kurang dari panjang nilai dalam variabel bilangan maka perulangan akan terus berlanjut
                    System.out.print(bilangan[i][j][k] + " ");//mencetak smua elemen 
                }
                System.out.println(); //membuat baris baru pada setiap baris kubus selesai ditampilkan
            }
            System.out.println(); //membuat baris baaru pada setiap setiap lapisan kubus selesai ditampilkan
        }
    }
}
