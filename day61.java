package days.of.coding;

public class day61 {
    public static void main(String[] args) {
        int[] angkaLagi = {1, 2, 3, 4, 5}; //menginisialisasikan variabel array yang bernama angkaLagi bertipe integer

        // Mencetak elemen-elemen array
        System.out.print("Elemen array: ");
        for (int i = 0; i < angkaLagi.length; i++) { //menggunakan perulangan, dimana i sama dengan 0, jika nilai 1 kurang dari nilai dalam variabel angkaLagi
            System.out.print(angkaLagi[i] + " "); //maka nilai akan terus muncul sampai bbatas nilai dalam variabel tersebut
        }

        // Mencari nilai maksimum dalam array
        int maksimum = angkaLagi[0];  //Mendeklarasikan variabel maksimum dengan elemen pertama dari variabel angkaLagi
        for (int i = 1; i < angkaLagi.length; i++) { //iterasi melalui variabel angkaLagi mulai dari indeks kedua (indeks 1) hingga indeks terakhir
            if (angkaLagi[i] > maksimum) { //jika elemen yang ada pada angkaLagi lebih besar dari variabel maksimum
                maksimum = angkaLagi[i]; //maka nilai maksimum sama dengan nilai pada angkaLagi
            }
        }
        System.out.println("Nilai maksimum dalam array: " + maksimum); //mencetak hasil pencarian nilai max
    }
}
