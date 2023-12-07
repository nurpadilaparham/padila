package days.of.coding;

public class day60 {
    public static void main(String[] args) {
        // Mendefinisikan array angka
        int[] arrayAngka = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Memanggil untuk memeriksa bilangan genap dan ganjil
        int[] genap = cekGenap(arrayAngka);
        int[] ganjil = cekGanjil(arrayAngka);

        // Mencetak hasil
        System.out.println("Bilangan genap:");
        for (int angka : genap) {
            System.out.print(angka + " ");
        }

        System.out.println("\nBilangan ganjil:");
        for (int angka : ganjil) {
            System.out.print(angka + " ");
        }
    }

    // Mengecek bilangan genap dalam array
    public static int[] cekGenap(int[] arr) {
        int angkaGenap = 0;

        // Menghitung jumlah bilangan genap
        for (int angka : arr) {
            if (angka % 2 == 0) { //jika angka habis dibagi 2 atau sama dengan 0 maka angka itu adalah angka genap
                angkaGenap++; // angka akan terus berlanjut dan disimpan dalam variabel angkaGwnap
            }
        }

        // Menyimpan bilangan genap dalam array
        int[] genap = new int[angkaGenap];
        int  nilai = 0;
        for (int angka : arr) {
            if (angka % 2 == 0) {
                genap[nilai++] = angka;
            }
        }

        return genap;
    }

    // Mengecek bilangan ganjil dalam array
    public static int[] cekGanjil(int[] arr) {
        int angkaGanjil = 0;

        // Menghitung jumlah bilangan ganjil
        for (int angka : arr) {
            if (angka % 2 != 0) { //jika angka habis dibagi 2 atau tidak sama dengan 0 maka angka itu adalah angka ganjil
                angkaGanjil++;
            }
        }

        // Menyimpan bilangan ganjil dalam array
        int[] ganjil = new int[angkaGanjil];
        int index = 0;
        for (int angka : arr) {
            if (angka % 2 != 0) {
                ganjil[index++] = angka;
            }
        }

        return ganjil;
    }
}

