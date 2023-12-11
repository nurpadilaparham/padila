package days.of.coding;

public class day64 {
    public static void main(String[] args) {
        int[] angka = {1, 2, 3, 4, 5};//array dengan nama variabel angka, dimana memiliki 5 elemen atau nilai

        System.out.print("\nIsi array: ");//mencetak isi array
        for (int i = 0; i < angka.length; i++) {//selama i kurang dari nilai dalam panjang variabel angka maka perulangan akan terus berlanjut
            System.out.print(angka[i] + " ");//mencetak nilai setiap elemen atau indeks dalam variabel angka
        }

        System.out.print("\nHasil perkalian 2: ");//mencetak hasil perkalian 2
        for (int i = 0; i < angka.length; i++) {////selama i kurang dari nilai dalam panjang variabel angka maka perulangan akan terus berlanjut
            angka[i] *= 2; //setiap nilai dalam indeks variabel angka akan dikalikan dengan 2
            System.out.print(angka[i] + " ");//mencetak hasil kali 2 dari nilai setiap elemen atau indeks dalam variabel angka
        }
    }
}