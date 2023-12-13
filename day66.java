package days.of.coding;

public class day66 {
    public static void main(String[] args) {
        int[] nilai = {35, 50, 90, 85, 45};//nama variabel array nilai dengan tipe dta integer dan menyimpan nilai, 35, 50, 90, 85, dan 45

        for (int i = 0; i < nilai.length; i++) {//menggunakan perulangan for, selama i kurang dari panjang nilai maka perulangan akan terus berlanjut
            System.out.print("Nilai ke-" + (i + 1) + ": " + nilai[i] + ", Status: ");//mencetak kalimat nilai ke- dari indeks 0 sampai indeks terakhir dan juga status
            
            if (nilai[i] >= 50) {//menggunakan kondisi, jika nilai pada setiap indeks dalam variabel nilai lebih besar atau sama dengan 50
                System.out.println("Lulus");//maka mencetak lulus
            } else {
                System.out.println("Tidak Lulus");//selain dari pada itu maka dinyatakan tidak lulus
            }
        }
    }
}
